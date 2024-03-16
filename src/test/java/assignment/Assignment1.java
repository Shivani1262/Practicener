package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.nykaa.com/");
		Thread.sleep(2000);
		WebElement a = d.findElement(By.name("search-suggestions-nykaa"));
		Thread.sleep(3000);
		a.sendKeys("Perfumes");
		Thread.sleep(3000);
		a.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		d.findElement(By.className("control-indicator radio active")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Price']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Rs. 500 - Rs. 999']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Brand']")).click();
//		Thread.sleep(3000);
//		d.findElement(By)
//		Thread.sleep(3000);
//		d.findElement(By.cssSelector("img[alt='Moi By Nykaa Mini Pocket Perfume']")).click();
//		Thread.sleep(3000);

	}

}
