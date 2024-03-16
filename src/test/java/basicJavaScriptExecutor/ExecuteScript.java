package basicJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript {

	public static void main(String[] args) throws InterruptedException{
		WebDriver wb = new ChromeDriver();
		
		wb.manage().window().maximize();
		
		wb.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		//Step1 : DownCast JavaScriptExecutor to access executeScript() and executeAsyncScript()
		JavascriptExecutor js = (JavascriptExecutor) wb ;
		
		//Step2 : Call executeScript(String script,object)
	/*	js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-2000)");    */
		
		Thread.sleep(3000);
		//Horizontal scrolling from left to right
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		js.executeScript("window.scrollTo(0,900)");
		Thread.sleep(3000);
		//Horizontal scrolling from right to left
//		js.executeScript("window.scrollTo(0,-document.body.scrollWidth)");
//		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		js.executeScript("window.scrollTo(0,-400)");
		
		
	}

}
