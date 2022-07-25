package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void readAlldata() throws IOException {
		File f= new File("C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\testdata\\Book.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i <physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j <physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
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
			

		}

	}
	public static void main(String[] args) throws IOException {
		readAlldata();
	}
	
	

}
