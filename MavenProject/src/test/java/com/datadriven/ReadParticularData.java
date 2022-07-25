package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadParticularData {

	public static void readParticularData() throws IOException {
		File f= new File("C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\testdata\\Book.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();

		if(type.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else if (type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num=(int) numericCellValue;
			System.out.println(num);

		}

	}
	public static void main(String[] args) throws IOException {
		readParticularData();
	}

}
