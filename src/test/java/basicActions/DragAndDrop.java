package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		wb.get("https://letcode.in/dropable");
		
		Thread.sleep(3000);
		WebElement drag = wb.findElement(By.id("draggable"));
		Thread.sleep(3000);
		WebElement drop = wb.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions a = new Actions(wb);
//		a.dragAndDrop(drag, drop);
		
	/* We can perform dragAndDrop Operation With the help of clickAndHold(),moveToElement() And release() */	
		a.clickAndHold(drag).moveToElement(drop).release();
		a.perform();
		

	}

}
