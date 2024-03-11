package ncPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NCLoginPage {

	WebDriver driver;

	By email = By.id("Email");
	By pws = By.name("Password");
	By loginBtn = By.tagName("button");

	public void enterEmail() {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		driver.findElement(pws).clear();
		driver.findElement(pws).sendKeys("admin");
	}

	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}

	public NCLoginPage(WebDriver d) {
		this.driver = d;
	}

}
