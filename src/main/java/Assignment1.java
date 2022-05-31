import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		List<WebElement> checkbox = driver.findElements(By.cssSelector("input[id*='check']"));
		for (WebElement chbox : checkbox) {
			chbox.click();
		}
		System.out.println(checkbox.size());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Thread.sleep(8000);
		driver.close();

	}

}
