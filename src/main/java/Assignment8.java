import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");	
		driver.findElement(By.xpath("//span[contains(text(),'Select WORD files')]")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\vineetaj\\Documents\\fileupload.exe");
	}

}
