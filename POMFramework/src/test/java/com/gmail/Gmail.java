package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail
{
	WebDriver driver;
	
	By userid=By.id("email");
	By pass=By.name("pass");
	By log=By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input");
	
	
	public Gmail(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void username(String user)
	{
		driver.findElement(userid).sendKeys(user);
	}
	public void password(String passs)
	{
		driver.findElement(pass).sendKeys(passs);
	}
	
	public void submit()
	{
		driver.findElement(log).click();
	}
	
	
}
