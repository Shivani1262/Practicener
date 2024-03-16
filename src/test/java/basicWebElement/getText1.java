package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.tirabeauty.com/");
		Thread.sleep(3000);
		
		WebElement searchtf = wb.findElement(By.id("search"));			//mobilesearch
		Thread.sleep(3000);
		searchtf.sendKeys("Perfumes");
		Thread.sleep(2000);
		searchtf.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String str = wb.findElement(By.xpath("(//div[@class='product-name'])[2]")).getText();
		System.out.println(str);			
	}

}
