package assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor_ScrollBy {

	public static void main(String[] args) {
		WebDriver wb=new ChromeDriver();
		wb.manage().window().maximize();;
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wb.get("https://www.tirabeauty.com/");
		
		WebElement fragrance = wb.findElement(By.xpath("//a[text()='Fragrance']"));
		Actions a = new Actions(wb);
		a.moveToElement(fragrance);
		a.perform();
		
//		wb.findElement(By)

	}

}
