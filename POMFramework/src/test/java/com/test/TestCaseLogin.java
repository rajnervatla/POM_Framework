package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gmail.Gmail;

public class TestCaseLogin 
{
	@Test
	public void LoginFb()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Tasks\\Selenium Soft\\geckodriver-v0.11.1-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		Gmail g=new Gmail(driver);
		g.username("vvvv");
		g.password("vvv");
		g.submit();
	}
}
