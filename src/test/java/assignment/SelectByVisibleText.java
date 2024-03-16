package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		WebElement language = d.findElement(By.xpath("//div[text()='EN']"));
		Actions a = new Actions(d);
		a.moveToElement(language);
		a.perform();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//div[text()='Change country/region.'])[1]")).click();
		
		Thread.sleep(2000);
		d.findElement(By.cssSelector("span[class='a-button-text a-declarative']")).click();
		WebElement country = d.findElement(By.xpath("//a[text()='India']"));
		a.click(country);
		a.perform();
		
	}

}
