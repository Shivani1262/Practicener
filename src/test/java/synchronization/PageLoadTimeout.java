package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeout {

	public static void main(String[] args)  {
		WebDriver wb = new ChromeDriver();
		
		wb.manage().window().maximize();
		
		wb.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		wb.get("https://www.myntra.com/");
		
		wb.findElement(By.className("desktop-searchBar")).sendKeys("Wallet");

	}

}
