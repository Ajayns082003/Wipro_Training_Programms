package com.demo.nop.utils;

import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;

public class ExcelUtil {
    private static String TESTDATA_SHEET_PATH = "C:\\Users\\ruler\\Downloads\\list.xlsx";

    public static Object[][] getTestData(String sheetName) {
        try (FileInputStream fis = new FileInputStream(TESTDATA_SHEET_PATH);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("Sheet '" + sheetName + "' not found in " + TESTDATA_SHEET_PATH);
            }
            int rowCount = sheet.getLastRowNum();
            int colCount = sheet.getRow(0).getLastCellNum();

            Object[][] data = new Object[rowCount][colCount];
            for (int i = 1; i <= rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
                }
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error while reading Excel data: " + e.getMessage());
        }
    }
}
