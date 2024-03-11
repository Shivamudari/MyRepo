package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestExample17 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");

		Thread.sleep(5000);

		driver.switchTo().frame(0);

		WebElement source = driver.findElement(By.id("draggable"));

		Thread.sleep(3000);

		WebElement target = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		action.dragAndDrop(source, target).perform();

		Thread.sleep(4000);

		driver.quit();

	}

}
