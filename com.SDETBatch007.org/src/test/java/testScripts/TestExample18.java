package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample18 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tspsc.gov.in/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[contains(text(), 'Website')]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		Thread.sleep(5000);

		driver.quit();

	}

}
