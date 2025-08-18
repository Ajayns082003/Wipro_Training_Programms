package Data_driven;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

public class ExcelReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\ruler\\Downloads\\dataprovider.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("LoginData");

        int rows = sheet.getLastRowNum();
        for (int i = 1; i <= rows; i++) {
            String user = sheet.getRow(i).getCell(0).getStringCellValue();
            String pass = sheet.getRow(i).getCell(1).getStringCellValue();
            System.out.println(user + " | " + pass);
        }
        wb.close();
    }
}
