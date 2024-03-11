package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample11 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(), 'Sales')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(" //*[contains(text(), ' Orders')]")).click();

		Thread.sleep(3000);

		WebElement countryId = driver.findElement(By.id("BillingCountryId"));

		Thread.sleep(3000);

		Select selection = new Select(countryId);

		List<WebElement> allCountries = selection.getOptions();

		System.out.println("List of Billing Countries:");

		for (WebElement allIds : allCountries) {
			String value = allIds.getText();
			System.out.println(value);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
