package com.expleo.Air_irctc;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;

public class DproviderExcel {

	@DataProvider(name = "excelData", parallel = true)
	public Object[][] excelDataProvider() throws Exception {
	    String filePath = System.getProperty("user.dir") + "/src/test/resources/exceldata2.xlsx";
	    return getExcelData(filePath, "Sheet1");
	}


    public String[][] getExcelData(String fileName, String sheetName) throws Exception {
        String[][] data = null;

        try (FileInputStream fis = new FileInputStream(fileName);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheet(sheetName);
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCols = sheet.getRow(0).getLastCellNum();

            data = new String[noOfRows][noOfCols];

            for (int i = 0; i < noOfRows; i++) {  
                Row row = sheet.getRow(i);
                for (int j = 0; j < noOfCols; j++) {
                    Cell cell = row.getCell(j);
                    data[i][j] = (cell == null) ? "" : cell.toString();
                }
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return data;
    }
}
