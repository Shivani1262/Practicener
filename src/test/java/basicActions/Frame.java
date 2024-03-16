package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		wb.get("https://www.google.com/");
		
		Thread.sleep(3000);
		//To click on google apps
		wb.findElement(By.className("gb_d")).click();
		
		Thread.sleep(3000);
		wb.switchTo().frame("app");
		
//		WebElement app = wb.findElement(By.cssSelector("iframe[role='presentation']"));
//		wb.switchTo().frame(app);
		
//		WebElement sc = wb.findElement(By.cssSelector("iframe[scrolling='no']"));
//		wb.switchTo().frame(sc);
		
		//To click on youtube
		wb.findElement(By.xpath("//span[text()='YouTube']")).click();
	}

}
