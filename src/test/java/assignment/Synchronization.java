package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(wb,Duration.ofSeconds(10));
		
		wb.get("https://www.myntra.com/");
		Thread.sleep(3000);
		wb.findElement(By.className("desktop-searchBar")).sendKeys("Watches");
		Thread.sleep(3000);
		wb.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(3000);
		wb.findElement(By.xpath("//label[text()='Women']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) wb ;
		js.executeScript("window.scrollBy(0,500)");
		wb.findElement(By.cssSelector("div[class='brand-more']")).click();
//		wb.findElement(By.xpath("//label[text()='Fastrack']")).click();
		
		
	}

}
