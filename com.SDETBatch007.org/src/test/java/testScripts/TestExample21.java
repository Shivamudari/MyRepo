package testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample21 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));

		driver.get("https://www.amazon.in/ref=footer_logo");

		Thread.sleep(5000);

		JavascriptExecutor execute = (JavascriptExecutor) driver;

		execute.executeScript("window.scrollBy(0,5800);");

		Thread.sleep(5000);

		execute.executeScript("document.getElementsByClassName('nav_a')[19].click();");

		Thread.sleep(5000);

		execute.executeScript("window.scrollBy(0,4100);");

		Thread.sleep(5000);

		execute.executeScript("document.getElementsByClassName('navFooterBackToTopText')[0].click();");

		Thread.sleep(3000);

		driver.quit();
	}

}
