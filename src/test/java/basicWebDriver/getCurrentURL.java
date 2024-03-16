package basicWebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentURL {

	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		String actualURL = d.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(actualURL);
		Thread.sleep(2000);
		d.findElement(By.className("desktop-searchBar")).sendKeys("SunGlasses");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(2000);
		String sunglassesurl = d.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(sunglassesurl);
	}

}
