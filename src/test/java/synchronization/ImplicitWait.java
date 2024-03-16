package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		wb.get("https://www.myntra.com/");
		
		wb.findElement(By.className("desktop-searchBar")).sendKeys("SunGlasses");
	}

}
