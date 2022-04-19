package com.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadEx {

	public static void main(String[] args) throws Exception {
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getLastRowNum();
		System.out.println(rows);
		for (int i = 0; i < rows; i++) {
			int cols = sh.getRow(i).getLastCellNum();
			for (int j = 0; j < cols; j++) {
				Cell cc = sh.getRow(i).getCell(j);
				String data = df.formatCellValue(cc);
				System.out.print(data + "  ");

			}
			System.out.println();

		}
	}

}
