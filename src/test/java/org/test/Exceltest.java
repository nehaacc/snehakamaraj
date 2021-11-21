package org.test;

import java.io.IOException;

import org.junit.Test;

public class Exceltest {
@Test
public void readExeclTest() throws IOException {
	Excelreaddata obj=new Excelreaddata();
	String readdata = obj.readdata("sheet1",4,1);
	System.out.println(readdata);
	
	

}
}
