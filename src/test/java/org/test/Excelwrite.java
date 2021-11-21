package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {
	
	public void writeExcel(String sheetName,String cellvalue,int row,int cell ) throws IOException {
		
	String excelpath="C:\\Users\\User\\eclipse-workspace\\NewProject\\Testdata\\Exceldata.xlsx";
	File f=new File(excelpath);
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet(sheetName);
	sheet.getRow(row).createCell(cell).setCellValue(cellvalue);
	FileOutputStream fos=new FileOutputStream(new File(excelpath));
	wb.write(fos);
		

	}

}
