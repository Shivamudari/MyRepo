package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample19 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("(//p[contains(text(), 'Catalog')])[1]")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
