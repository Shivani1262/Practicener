package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		Thread.sleep(3000);
		WebElement beauty = wb.findElement(By.xpath("//span[text()='BEAUTY']"));
		Thread.sleep(3000);
		Actions a = new Actions(wb);
//		a.moveToElement(beauty);
//		a.moveToElement(beauty, -50, 0);
		a.moveByOffset(999, 999).contextClick();
		Thread.sleep(3000);
		a.perform();
	}

}
