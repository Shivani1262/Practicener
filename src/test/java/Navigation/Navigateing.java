package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateing {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver d = new ChromeDriver();
	
/*		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		d.findElement(By.className("desktop-searchBar")).sendKeys("SunGlasses");
		Thread.sleep(3000);
		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(5000);
		d.navigate().forward();
		Thread.sleep(7000);
		d.navigate().refresh();			*/
		
		Thread.sleep(3000);
		d.navigate().to("https://www.myntra.com/sunglasses?rawQuery=sunglasses");
		

	}

}
