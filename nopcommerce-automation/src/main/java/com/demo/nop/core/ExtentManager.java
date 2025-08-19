package com.demo.nop.core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter("reports/AutomationReport.html");
            spark.config().setReportName("nopCommerce Automation Report");
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }
}
