package com.demo.nop.listeners;

import com.aventstack.extentreports.*;
import com.demo.nop.core.DriverManager;
import com.demo.nop.core.ExtentManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        test.set(extent.createTest(result.getMethod().getMethodName())
                .assignCategory(result.getMethod().getGroups()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, result.getThrowable());

        WebDriver driver = DriverManager.getDriver();
        if (driver != null) {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String path = "reports/screenshots/" + result.getName() + "_" + timestamp + ".png";

            new File("reports/screenshots").mkdirs();

            try {
                FileUtils.copyFile(src, new File(path));
                test.get().addScreenCaptureFromPath(path);
            } catch (IOException e) {
                test.get().log(Status.WARNING, "Screenshot failed: " + e.getMessage());
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
