package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NCOrdersPage {

	WebDriver driver;

	By searchBtnInOrder = By.xpath("(//*[contains(text(), 'Search')])[2]");
	By productField = By.xpath("//input[@id = 'search-product-name']");
	By searchBtn = By.xpath("//button[@id = 'search-orders']");

	public void searchBtnInOrderPage() {

		driver.findElement(searchBtnInOrder).click();
	}

	public void enterProductName() {

		driver.findElement(productField).sendKeys("mouse");
	}

	public void searchButton() {

		driver.findElement(searchBtn).click();
	}

	public NCOrdersPage(WebDriver d) {
		this.driver = d;
	}

}
