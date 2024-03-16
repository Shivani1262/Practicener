package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize_Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.tirabeauty.com/");
		Thread.sleep(3000);
		
		Dimension searchtf = wb.findElement(By.id("search")).getSize();
		System.out.println(searchtf.getWidth());
		System.out.println(searchtf.getHeight());
		
		Thread.sleep(3000);
		WebElement Searchtf = wb.findElement(By.id("search"));
		Thread.sleep(3000);
		Searchtf.sendKeys("Lipsticks");
		Thread.sleep(3000);
		Searchtf.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    Dimension lipsticks = wb.findElement(By.cssSelector("img[alt='MARS | MARS Matte Lipsticks Box (3.5gm)']")).getSize();
	    Thread.sleep(3000);
	}

}
