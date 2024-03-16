package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.google.com/");
		Thread.sleep(3000);
		
		WebElement google = wb.findElement(By.id("APjFqb"));
		Actions a = new Actions(wb); 
		a.contextClick(google);
		a.perform();
		
	}

}
