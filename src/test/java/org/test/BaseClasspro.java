package org.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClasspro {
	static WebDriver driver;
    
	public static  void browserconfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumDay\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://adactinhotelapp.com/");

}
	
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		
		data[0][0]="YAMINIKAMARAJ";
		data[0][1]="Neha0712";
		
		data[1][0]="YAMINIKAMARAJ";
		data[1][1]="YAMINIKAMARAJ";
		
		data[2][0]="YAMINIKAMARAJ";
		data[2][1]="YAMINIKAMARAJ";
		
		return data;

	}
}