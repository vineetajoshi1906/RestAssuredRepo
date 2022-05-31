package com.corePyramin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.corePyramid.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(id= "pydLogin_txtUserid")
	WebElement username;
	@FindBy(id= "pydLogin_txtUserPwd")
	WebElement password;
	@FindBy(id= "pydLogin_btnLogin")
	WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public  LandingPage ValidateLogin(String Username,String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		login.click();
		return new LandingPage();
		}

	public String validateTitle() {
		return driver.getTitle();

	}

	}
	