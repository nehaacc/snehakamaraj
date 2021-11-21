package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class LoginPage extends BaseClass {
	 
	public void Login(String username,String pass) {
		 driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(pass);
		
		driver.findElement(By.id("login")).click();
		
		
		
		
	}

}
