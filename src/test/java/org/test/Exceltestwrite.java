package org.test;

import java.io.IOException;

import org.junit.Test;

public class Exceltestwrite {
	
	Excelwrite obj=new Excelwrite ();
	@Test
	public void Exceltestwrite() throws IOException {
		obj.writeExcel("sheet1","kk", 1, 4);
		
		
	}
	@Test
	public void Exceltestwrite1() throws IOException
	{
		obj.writeExcel("sheet1","New",3, 4);
	}
		
	}
		 
	
	
	
	
		
		
	


