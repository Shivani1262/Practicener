package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnWebElementTargeted {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		Thread.sleep(3000);
		//Step1 : Identify the webelement
		WebElement bag = wb.findElement(By.xpath("//span[text()='Bag']"));
		//Step2 : Create object of Actiona class
	   //Step3 : pass webdriver referance as an argument to Actions constructor
		Actions a = new Actions(wb);
		//Step4 : Click on the Webpage
		 a.click();
		//Step4 : Clicking on bag-Click(WebElement Targeted)
		a.click(bag);
		a.perform();
		
	}

}
