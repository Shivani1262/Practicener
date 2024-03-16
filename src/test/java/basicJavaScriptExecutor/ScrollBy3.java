package basicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy3 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver wb = new ChromeDriver();
		 wb.manage().window().maximize();
		 wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 wb.get("https://www.ajio.com/");
		 
		 Thread.sleep(3000);
	     wb.findElement(By.name("searchVal")).sendKeys("Watches");
		 Thread.sleep(3000);
		 wb.findElement(By.className("ic-search")).click();
		 
		 JavascriptExecutor js = (JavascriptExecutor) wb ;
//		 js.executeScript("window.scrollBy(0,3000)");
		 
		 for(;;) {
			 

		 try {
			 wb.findElement(By.cssSelector("img[alt='Product image of Giordano GZ50058 Analogue Round Shaped Watch']")).click();
		     break;
		 }
		 catch(NoSuchElementException nse) {
			 js.executeScript("window.scrollBy(0,1000)");
		 }
	   } 
	}

}
