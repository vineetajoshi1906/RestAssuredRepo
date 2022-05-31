package com.corePyramid.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {

	public static WebDriver driver;
	public static Properties pro;

public TestBase() {
	try {
		pro=new Properties();
//		FileInputStream fis=new FileInputStream("C:\\Users\\vineetaj\\eclipse-workspace\\Upskill_2022\\src\\main\\java\\com\\corePyramid\\config\\config.properties");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\corePyramid\\config\\config.properties");

		pro.load(fis);
	}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public  static void Initialization() {
	String browser=pro.getProperty("browser");
	if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\com\\corePyramid\\config\\chromedriver.exe");
		driver=new ChromeDriver();}
		else if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\com\\corePyramid\\config\\gecko.exe");
		driver=new FirefoxDriver();
			}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(pro.getProperty("URL"));
	
	}
	public String getScreenshot(String testcasename,WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String DestinationFile=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		try {
			FileUtils.copyFile(source,new File(DestinationFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DestinationFile;
	}
}