package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		wb.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		WebElement search = wb.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		
//		WebElement bag = wb.findElement(By.xpath("//span[text()='Bag']"));
		
		Actions a = new Actions(wb);
		Thread.sleep(3000);
		
//		a.sendKeys("Watches");
		// Enter watches in search textfield
//		a.sendKeys(search, "Watches");					
		//Click on bag with the help of Sendkeys.
//		a.sendKeys(bag, Keys.ENTER);
		
		//Scrolling toward down --> sendkeys(CharSequence....Keys)
//		a.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(2000);
		//Scrolling toward down --> sendkeys(CharSequence....Keys)
//		a.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(8000);
		//Scrolling toward up --> sendkeys(CharSequence....Keys)
//		a.sendKeys(Keys.PAGE_UP);
		
//		a.sendKeys("Watches");
//		Thread.sleep(3000);
//		a.sendKeys(Keys.CONTROL+"a");
//		Thread.sleep(3000);
//		a.sendKeys(Keys.CONTROL+"c");
//		Thread.sleep(3000);
//		a.sendKeys(Keys.CONTROL+"v");
//		
	    a.perform();
	}

}
