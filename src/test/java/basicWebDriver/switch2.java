package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class switch2 {

	public static void main(String[] args)throws InterruptedException {
		EdgeDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("Sunglasses");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("div[class='search-bar-content-textSearch-icon']")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("img[alt='Smoke and Pink Gradient Sunglasses']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		d.findElement(By.xpath("//p[text()='Brand']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Image (24)']")).click();
	}

}
