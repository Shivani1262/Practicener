package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch1 {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		d.findElement(By.className("desktop-searchBar")).sendKeys("SunGlasses");
		Thread.sleep(3000);
		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		//to click on the img
		Thread.sleep(3000);
		d.findElement(By.cssSelector("img[alt='Voyage Unisex Square Sunglasses 58157MG2970']")).click();
		Thread.sleep(3000);
		//step1:To check how many tabs or window is present
		Set<String> ids = d.getWindowHandles();
		System.out.println(ids);
		Thread.sleep(3000);
		for(String s : ids)									
		{
			String title = d.switchTo().window(s).getTitle();
			System.out.println(title);
			//when we are have one parent and more than one child then we use - if() - to print the child title.
			if(title.contains("Buy Voyage Unisex Square Sunglasses 58157MG2970 - Sunglasses for Unisex 10748540 | Myntra"));
		}
		Thread.sleep(3000);
		//To click on Add to bag button
		d.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
	}

}
