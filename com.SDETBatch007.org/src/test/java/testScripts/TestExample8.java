package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample8 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		boolean select = driver.findElement(By.id("RememberMe")).isSelected();

		System.out.println("Is Checkbox Selected: " + select);

		boolean enable = driver.findElement(By.tagName("button")).isEnabled();

		System.out.println("Is Log in Enabled: " + enable);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(2000);

		boolean display = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).isDisplayed();

		System.out.println("Is Log in Successed and Dashboard displayed: " + display);

		driver.findElement(By.xpath("//p[contains(text(), 'Catalog')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[contains(text(), 'Products')]")).click();

		Thread.sleep(2000);

		boolean display1 = driver.findElement(By.className("float-left")).isDisplayed();

		System.out.println("Is Products Page is Displayed: " + display1);

		driver.findElement(By.id("SearchProductName")).sendKeys("Build your own computer");

		Thread.sleep(2000);

		driver.findElement(By.id("search-products")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();

		boolean display2 = driver.findElement(By.id("Email")).isDisplayed();

		System.out.println("Is Log out Successed: " + display2);

		driver.quit();

	}

}
