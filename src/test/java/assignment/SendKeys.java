package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://skillrary.com/");
		Thread.sleep(3000);
		wb.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
		wb.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		Thread.sleep(3000);
		Set<String> ids = wb.getWindowHandles();
		for(String a:ids) {
			String url = wb.switchTo().window(a).getCurrentUrl();
			String childUrl = "https://demoapp.skillrary.com/";
			
			if(url.contains(childUrl)) {
				break ;
			}
		}
		
		wb.findElement(By.xpath("//a[text()='LOGIN']")).click();
		Thread.sleep(3000);
		WebElement emailtf = wb.findElement(By.id("email"));
		emailtf.sendKeys("Shivani12@gmail.com");
		
		Thread.sleep(3000);
		emailtf.sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(3000);
		emailtf.sendKeys(Keys.CONTROL+"c");
		
		Thread.sleep(3000);
		WebElement passtf = wb.findElement(By.id("password"));
		passtf.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(3000);
		wb.findElement(By.id("keepLoggedInCheckBox")).click();
		
		Thread.sleep(3000);
		wb.findElement(By.name("login")).click();
		
	}

}
