package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuildAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		WebElement home = wb.findElement(By.xpath("//a[text()='Home & Living']"));
		
		Actions a = new Actions(wb);
		a.moveToElement(home);
//		a.build();					//selenium  3 version to build actions class element and to perform action.
		a.perform();
	}

}
