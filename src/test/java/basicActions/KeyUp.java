package basicActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		Thread.sleep(3000);
		
		WebElement men = wb.findElement(By.xpath("//span[text()='MEN']"));
		
		Thread.sleep(3000);
		Actions a = new Actions(wb);
		//Step1 : Press Control Button
		a.keyDown(Keys.CONTROL).perform();
		
		Thread.sleep(3000);
		//Step2 : Click on Men
		a.click(men).perform();
		
		Thread.sleep(3000);
		//Step3 : Release Control Button
		a.keyUp(Keys.CONTROL);
	}

}
