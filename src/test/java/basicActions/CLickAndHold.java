package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CLickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		wb.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		WebElement cart = wb.findElement(By.cssSelector("div[class='ic-cart ']"));
		
		Thread.sleep(3000);
		Actions a = new Actions(wb);
//		a.clickAndHold(cart);
		a.clickAndHold();
		a.perform();
	}

}
