package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample15 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(), 'System')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Log')]")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'log-grid']/tbody/tr"));

		int rowsCount = rows.size();

		System.out.println("Rows count in log-grid is : " + rowsCount);

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'log-grid']/tbody/tr[1]/td"));

		int columnsCount = columns.size();

		System.out.println("Columns count in log-grid is : " + columnsCount);
		
		System.out.println();

		for (int r = 1; r <= rowsCount; r++) {

			for (int c = 1; c <= columnsCount; c++) {

				String val = driver.findElement(By.xpath("//table[@id = 'log-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();

				System.out.print(val + "   ");

			}
			System.out.println();
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
