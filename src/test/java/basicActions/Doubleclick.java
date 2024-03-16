package basicActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://skillrary.com/");
		Thread.sleep(3000);
		wb.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
		wb.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		Thread.sleep(3000);
		WebElement course = wb.findElement(By.id("course"));
		Actions a = new Actions(wb);
		a.moveToElement(course);
		a.perform();
		
		Thread.sleep(3000);
		WebElement selenium = wb.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		a.click(selenium);
		a.perform();
		
		Thread.sleep(3000);
		WebElement plus = wb.findElement(By.className("fa fa-plus"));
		a.doubleClick(plus);
		a.perform();

	}

}
