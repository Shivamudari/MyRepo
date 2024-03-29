package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExample24 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		driver.findElement(By.tagName("button")).click();

		List<WebElement> allUls = driver.findElements(By.xpath("//ul"));

		for (WebElement ul : allUls) {

			String val = ul.getAttribute("class");

			System.out.println(val);

		}
		Thread.sleep(5000);
		driver.quit();
	}

}
