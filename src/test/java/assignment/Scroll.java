package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
        WebDriver wb = new ChromeDriver();
		
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wb.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) wb ;
		for(;;) {
			 

			 try {
				 wb.findElement(By.xpath("//a[text()='About Amazon']")).click();
			     break;
			 }
			 catch(NoSuchElementException nse) {
				 js.executeScript("window.scrollBy(0,1000)");
			 }
		   } 
	}

}
