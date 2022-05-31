package com.corePyramin;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.corePyramid.base.TestBase;
import com.corePyramin.pages.LandingPage;
import com.corePyramin.pages.LoginPage;

public class LendingPageTest extends TestBase{
	LoginPage loginpage;
	LandingPage lendingpage;
	public LendingPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		Initialization();
		loginpage=new LoginPage();
		lendingpage=loginpage.ValidateLogin(pro.getProperty("username"), pro.getProperty("password"));
		}
	@Test
	public void ValidateSuccessfulLogin() {
		String user=lendingpage.lendingPageUser();
		System.out.println(user);
	Assert.assertTrue(user.contains("Vineeta"));
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
