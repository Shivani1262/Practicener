package basicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy1 {

	public static void main(String[] args) {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wb.get("https://letcode.in/test");
		
		wb.findElement(By.xpath("//a[text()='Edit']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) wb ;
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement textfield = wb.findElement(By.id("noEdit"));
		
		js.executeScript("arguments[0].value='Shivani'",textfield);
		

	}

}
