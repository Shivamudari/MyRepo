package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample10 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Catalog')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Products')]")).click();

		Thread.sleep(3000);

		WebElement category = driver.findElement(By.id("SearchCategoryId"));

		category.click();

		Thread.sleep(3000);

		category.sendKeys(Keys.DOWN);

		Thread.sleep(3000);

		category.sendKeys(Keys.DOWN);

		Thread.sleep(3000);

		category.sendKeys(Keys.DOWN);

		Thread.sleep(3000);

		category.sendKeys(Keys.ENTER);

		Thread.sleep(5000);

		driver.quit();
	}

}
