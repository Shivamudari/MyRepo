package ncTestCasePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ncPages.NCUtilities;
import pageFactoryClassPOM.InBuildNCLoginPage;

public class ValidateNCLoginWithPOM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		NCUtilities ncu = new NCUtilities(driver);
		InBuildNCLoginPage ibnlp = new InBuildNCLoginPage(driver);

		ncu.setUp();
		Thread.sleep(5000);
		ibnlp.enterEmail();
		ibnlp.enterPassword();
		ibnlp.clickLoginButton();
		Thread.sleep(5000);
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();

	}

}
