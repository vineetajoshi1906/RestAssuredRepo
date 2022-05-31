package com.corePyramin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.corePyramid.base.TestBase;

public class LandingPage extends TestBase{
@FindBy(id="lblUserName")
WebElement empname;
@FindBy(xpath="//tbody//tr[1]/td[3]")
WebElement Homelink;
@FindBy(id="HeaderMenu1_ibtnHelpDesk")
WebElement HelpDesk;
@FindBy(id="HeaderMenu1_ibtnKMPortal")
WebElement KMPortal;
@FindBy(id="HeaderMenu1_ibtniRecruit")
WebElement iRecruit;
@FindBy(id="HeaderMenu1_tdSurvey")
WebElement Seurvey;
@FindBy(id="HeaderMenu1_tdLMS")
WebElement LSM;
@FindBy(id="HeaderMenu1_tdCab")
WebElement Cab;
@FindBy(id="HeaderMenu1_tdAms")
WebElement AMS;
@FindBy(id="HeaderMenu1_tdForum")
WebElement Forum;
@FindBy(xpath="//*[@id='PCIMenun28']")
WebElement Timesheet;
@FindBy(xpath="//a[contains(text(),'My Timesheet')]")
WebElement MyTimesheet;
public LandingPage() {
	PageFactory.initElements(driver, this);
}
public String lendingPageUser() {
	return empname.getText();
}
public String lendingPageTitle() {
	return driver.getTitle();
}
public HomePage clickHomelink() {
	Homelink.click();
	return new HomePage();
}
public HelpdeskPage helpDeskclick() {
	HelpDesk.click();
	return new HelpdeskPage();

}
}
