package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {

    String path = "SampleData.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        // workbook > sheet > row > cell

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employees");

        //indexes starts from 0.
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        // returns count of used cells only and it starts counting from 1
        // does not count empty rows
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        //returns the number from top row to bottom row
        //like index starts counting from 0
        //count empty rows too
        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("lastUsedRow = " + lastUsedRow);

        for (int rowNum = 0; rowNum < usedRows ; rowNum++) {

            if (sheet.getRow(rowNum).getCell(0).toString().equals("Sasha")) {

                System.out.println("Current cell = " + sheet.getRow(rowNum).getCell(0));
            }

        }

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {

            if(sheet.getRow(rowNum).getCell(0).toString().equals("Steven")) {

                System.out.println("Steven's JOB_ID: " + sheet.getRow(rowNum).getCell(2));
            }
        }


    }
}
