import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		List<WebElement> tabcols = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[2]/td"));
		System.out.println(tabcols.size());
		Thread.sleep(4000);
		for (WebElement wb : tabcols) {
			System.out.println(wb.getText());
		}
		driver.close();
	}

}
