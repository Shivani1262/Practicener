package basicActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		Thread.sleep(3000);
		
		//Step1 : Identify the webelement
		WebElement men = wb.findElement(By.xpath("//span[text()='MEN']"));
		Thread.sleep(3000);
		//Step2 : Create object of Actiona class
		//Step3 : pass webdriver referance as an argument to Actions constructor
		 Actions a = new Actions(wb);
		 Thread.sleep(3000);
		//Step4 : Mouse hover on men
		 a.moveToElement(men);
		 Thread.sleep(3000);
		 //Step5 : Call perform()
		 a.perform();
	
	}

}
