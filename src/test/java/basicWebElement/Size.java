package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
		Dimension searchtf = wb.findElement(By.className("desktop-searchBar")).getSize();
		System.out.println(searchtf.getWidth());
		System.out.println(searchtf.getHeight());
		
		Thread.sleep(3000);
		wb.findElement(By.className("desktop-searchBar")).sendKeys("Watches");
		Thread.sleep(3000);
		wb.findElement(By.className("desktop-submit")).click();
		
		Thread.sleep(3000);
		//To take height and width of the watch
		Dimension watch = wb.findElement(By.cssSelector("img[alt='JOKER & WITCH Unisex Set Of 2 Mike & Phoebe Couple Watches Gift Set JWCW97']")).getSize();
		System.out.println(watch.getWidth());
		System.out.println(watch.getHeight());
		
	}

}
