package basicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wb.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		
		JavascriptExecutor js = (JavascriptExecutor) wb ;
		js.executeScript("window.scrollBy(0,500)");
		
		wb.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		
		WebElement button = wb.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']"));
		
		js.executeScript("arguments[0].click()",button);
	}

}
