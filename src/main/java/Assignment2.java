import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		Thread.sleep(4000);
		driver.findElement(By.name("name")).sendKeys("vineeta");
		driver.findElement(By.name("email")).sendKeys("vineeta.joshi1906@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Rahul123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement drpdwn = driver.findElement(By.id("exampleFormControlSelect1"));
		Select se = new Select(drpdwn);
		se.selectByVisibleText("Female");
		driver.findElement(By.xpath("//label[contains(text(),'Employed')]")).click();
		driver.findElement(By.name("bday")).sendKeys("15-05-1988");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String msg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(msg);

		driver.close();
	}

}
