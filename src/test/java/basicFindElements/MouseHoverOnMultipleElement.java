package basicFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnMultipleElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		//select multiple webelement = 6
		List<WebElement> all = wb.findElements(By.xpath("//div[@class='desktop-navContent']"));
		
		Actions a = new Actions(wb);
		
		for (WebElement w : all) {
			Thread.sleep(3000);
			a.moveToElement(w).perform();
		}

	}

}
