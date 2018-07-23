package com.test;


import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.fb.*;

import BrowserFactory.BrowserFactory;


public class VerifyFb 
{
	WebDriver driver;
	
	@BeforeTest
	public void launchB()
	{
		 driver=BrowserFactory.startBrowser("firefox","http://demosite.center/wordpress/wp-login.php");
		
	}
	@Test(priority=1)
	public void checkuser()
	{
		
		Fb f=PageFactory.initElements(driver, Fb.class);
		f.login_fb("adminq", "demo123");
		
	
	}
	@Test(priority=2)
	public void logout()
	{
		Logout l= PageFactory.initElements(driver, Logout.class);
		l.logout_btn();
		
		}
	@AfterTest
	public void Lg()
	{
		driver.close();
	}

}
