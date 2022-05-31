import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBrowser {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Softwares\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://pyramidcore.pyramidci.com");
        driver.findElement(By.id("pydLogin_txtUserid")).sendKeys("Vineeta.joshi");
        driver.findElement(By.id("pydLogin_txtUserPwd")).sendKeys("June@2022");
    	WebDriverWait wait =new WebDriverWait(driver,20);
    	

        driver.findElement(By.id("pydLogin_btnLogin")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//tbody//tr[1]/td[3]")).click();
        driver.switchTo().frame("contents");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='PCIMenun28']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'My Timesheet')]")).click();
        Thread.sleep(6000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='main']")));	
        driver.findElement(By.id("selectedTicket")).click();
        List <WebElement> group = driver.findElements(By.xpath("//select[@name='selectedGroup']"));
        Thread.sleep(2000);
      List<WebElement> wb = driver.findElements(By.xpath("//select[@id='selectedActivity']"));
 
        System.out.println(group.size());
        for (WebElement item:group) {
//            System.out.println("hello2");
//        	System.out.println(item.getText());
        	if (item.isEnabled()) {
        		System.out.println("hello");
        		Select se = new Select(item);
        		se.selectByVisibleText("Miscellaneous");
        		//Print Sorted list using Java stream
              List<String>originalls=se.getOptions().stream().map(s->s.getText()).collect(Collectors.toList());
              List<String>ls=se.getOptions().stream().map(s->s.getText()).sorted().collect(Collectors.toList());
              ls.stream().forEach(s->System.out.println(s)); 
              
      		//Print Original list using Java stream

              System.out.println("**** this is original list**********");
              originalls.stream().forEach(s->System.out.println(s));  

              if (ls.equals(originalls)) {
            	  System.out.print("lists are sorted");
              }
              else {
            	  System.out.print("lists are not sorted");

              }
              
              }
        }
	}
	

}
