package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreaddata {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public  Excelreaddata() throws IOException {
		String excelpath="C:\\Users\\User\\eclipse-workspace\\NewProject\\Testdata\\Exceldata.xlsx";
		File f=new File(excelpath);
		FileInputStream fis=new FileInputStream (f);
		wb=new XSSFWorkbook(fis);
		
		
	}
	
	public String readdata(String sheetName,int row,int cell) {
	 sheet = wb.getSheet(sheetName);
	 String data = sheet.getRow(row).getCell(cell).getStringCellValue();
	 return data;

	}
	

	

	}


