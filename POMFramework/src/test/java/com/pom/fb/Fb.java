package com.pom.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Fb
{
WebDriver driver;


public Fb(WebDriver driver)
{
	 this.driver=driver;
}
@FindBy(id="user_login") WebElement username;

@FindBy(how=How.NAME,using="pwd") WebElement password;

//@FindBy(how=How.XPATH,using="html/body/div[1]/form/p[4]/input[1]")WebElement login;

public void login_fb(String user,String pass)

{
	username.sendKeys(user);
	password.sendKeys(pass);
	//login.click();
}


}
