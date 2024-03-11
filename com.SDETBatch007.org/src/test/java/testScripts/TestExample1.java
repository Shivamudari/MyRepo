package testScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample1 {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		driver.navigate().back();
		
		Thread.sleep(5000);

		driver.navigate().forward();

		Thread.sleep(5000);
		
		driver.navigate().refresh();

		Thread.sleep(5000);
		
		driver.quit();

	}

}