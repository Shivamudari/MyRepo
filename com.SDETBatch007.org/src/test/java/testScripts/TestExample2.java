package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		Thread.sleep(5000);

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		String val = driver.getTitle();

		System.out.println(val);

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		Thread.sleep(5000);

		String url = driver.getCurrentUrl();

		System.out.println(url);

		Thread.sleep(5000);

		driver.quit();

	}

}
