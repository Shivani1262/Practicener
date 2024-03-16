package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		 wb.get("https://jqueryui.com/slider/");
		 
		 Thread.sleep(3000);
		 WebElement frm = wb.findElement(By.cssSelector("iframe[class='demo-frame']"));
		 wb.switchTo().frame(frm);
		 
		 Thread.sleep(3000);
		 WebElement source = wb.findElement(By.id("slider"));
		
		 Actions a = new Actions(wb);
		 a.dragAndDropBy(source, 80, 0);
		 a.perform();

	}

}
