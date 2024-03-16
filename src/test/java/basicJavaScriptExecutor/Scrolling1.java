package basicJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver wb = new ChromeDriver();
		
		wb.manage().window().minimize();;
		
		wb.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		//Step1 : DownCast JavaScriptExecutor to access executeScript() and executeAsyncScript()
		JavascriptExecutor js = (JavascriptExecutor) wb ;
		
		//Step2 : Call executeScript(String script,object)
		//Verticle Scrolling top-bottom
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		//Verticle Scrolling bottom-top
		js.executeScript("window.scrollBy(0,-2000)");
		//Horizontle Scrolling right-left
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(600,0)");
		//Horizontle Scrolling left-right
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(-300,0)");
	}

}
