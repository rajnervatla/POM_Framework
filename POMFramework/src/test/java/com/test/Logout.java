package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Logout
{
	WebDriver driver;
	
	public Logout(WebDriver driver)
	{
		 this.driver=driver;
	}
		//@FindBy(how=How.XPATH,using="html/body/div[1]/div[2]/div[1]/div/ul[2]/li/a/img")WebElement admin;
		
		@FindBy(how=How.LINK_TEXT,using="Lost your password?") 
		WebElement logout;
		
		public void logout_btn()
		
		{
			logout.click();
			System.out.println("link clicked");
		}
	}


