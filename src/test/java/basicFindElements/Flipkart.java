package basicFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		List<WebElement> all = wb.findElements(By.xpath("//div[@class='_1ch8e_']"));
//		List<WebElement> all = wb.findElements(By.xpath("//div[class='_3sdu8W emupdz']/div"));
//		List<WebElement> product = wb.findElements(By.cssSelector("div[aria-label='Fashion' or aria-label=\'Electronic']"));
		
		
		for (WebElement w : all) {
			Thread.sleep(3000);
			Actions a = new Actions(wb);
			a.moveToElement(w).perform();
		}
		
	}

}
