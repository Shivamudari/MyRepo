package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample13 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		Thread.sleep(3000);

		driver.findElement(By.id("confirmButton")).click();

		Thread.sleep(3000);

		Alert confirmation = driver.switchTo().alert();

		confirmation.dismiss();

		Thread.sleep(3000);

		driver.switchTo().defaultContent();

		driver.findElement(By.id("promtButton")).click();

		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();

		String value = popup.getText();

		System.out.println(value);

		popup.sendKeys("shiva");

		popup.accept();

		Thread.sleep(3000);

		driver.quit();

	}

}
