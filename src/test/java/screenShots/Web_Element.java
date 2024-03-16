package screenShots;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		//Step1 : 
	    WebElement ic = wb.findElement(By.cssSelector("a[class='myntraweb-sprite desktop-iconSearch sprites-search']"));
		
		//Step2 : Call getscreenshotAs and store in file form
		
		

	}

}
