package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample12 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(), 'System')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(), 'Templates')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("addCategoryTemplate")).click();

		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();

		String text = popup.getText();

		System.out.println(text);

		popup.accept();

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.quit();
	}

}
