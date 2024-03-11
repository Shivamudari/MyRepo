package ncPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NCUtilities {

	WebDriver driver;

	By sales = By.xpath("(//*[contains(text(), 'Sales')])[1]");
	By orders = By.xpath("//*[contains(text(), ' Orders')]");
	By logout = By.linkText("Logout");

	public void clickOnSales() {
		driver.findElement(sales).click();
	}

	public void clickOnOrders() {
		driver.findElement(orders).click();
	}

	public void doLogout() {
		driver.findElement(logout).click();
	}

	public void setUp() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void tearDown() {
		driver.quit();
	}

	public NCUtilities(WebDriver d) {
		this.driver = d;
	}
}
