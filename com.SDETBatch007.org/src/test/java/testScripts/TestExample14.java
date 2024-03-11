package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample14 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(5000);

		driver.switchTo().frame(3);

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[contains(text(), 'View larger')]/following::a)[3]")).click();

		Thread.sleep(5000);

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		driver.quit();

	}

}
