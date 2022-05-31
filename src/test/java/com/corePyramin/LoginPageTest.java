package com.corePyramin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import com.corePyramid.base.TestBase;
import com.corePyramin.pages.LoginPage;

public class LoginPageTest extends TestBase{
    public static Logger log=LogManager.getLogger(TestBase.class.getName());
	LoginPage loginpage;
	public LoginPageTest(){
		super();
		
	}
	@BeforeMethod
	public void setup() {
		Initialization();
		log.info("Driver is initialized");
		loginpage=new LoginPage();
	}
	@Test
	public void loginPageTitleTest() {
		String title= loginpage.validateTitle();
		log.info(title);
		log.info("first test completed sucessfully");
		Assert.assertEquals(title,"PyramidCore---Login");
		log.info("first test completed sucessfully");
	}
	@Test
	public  void ValidateLoginSucessfull() {
		loginpage.ValidateLogin(pro.getProperty("username"), pro.getProperty("password"));;
		log.info("2nd test completed sucessfully");
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
