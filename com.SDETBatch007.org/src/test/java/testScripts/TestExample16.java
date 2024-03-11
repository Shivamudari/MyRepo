
package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestExample16 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("nopSideBarPusher"))).perform();

		Thread.sleep(3000);

		action.contextClick().perform();

		Thread.sleep(3000);

		action.click().perform();

		Thread.sleep(3000);

		driver.quit();
	}

}
