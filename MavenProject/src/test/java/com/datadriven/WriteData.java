package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void writeData() throws IOException {
        File f=new File("C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\testdata\\write.xlsx");
        FileInputStream fis=new FileInputStream(f);
        Workbook wb=new XSSFWorkbook(fis);
      // wb.createSheet("sheet5").createRow(0).createCell(0).setCellValue("arjunan");
        wb.getSheet("sheet5").getRow(0).createCell(1).setCellValue("gdeffg");
        FileOutputStream fos=new FileOutputStream(f);
        wb.write(fos);
	}
	public static void main(String[] args) throws IOException {
      writeData();
	}
}
