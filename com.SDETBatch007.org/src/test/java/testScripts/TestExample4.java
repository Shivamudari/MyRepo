package testScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample4 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(5000);

		String id = driver.getWindowHandle();

		System.out.println(id);

		Thread.sleep(5000);

		driver.quit();

	}

}
