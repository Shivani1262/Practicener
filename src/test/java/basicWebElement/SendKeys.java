package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement emailtf = wb.findElement(By.id("email"));
		emailtf.sendKeys("Shivani12@gmail.com");
		Thread.sleep(3000);
		emailtf.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		emailtf.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		WebElement passtf = wb.findElement(By.id("pass"));
		passtf.sendKeys(Keys.CONTROL+"v");
	}

}
