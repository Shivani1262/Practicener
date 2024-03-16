package basicJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://demoapp.skillrary.com/");
		
		//Identify disabled texfield
		WebElement textfield = wb.findElement(By.cssSelector("input[class='form-control']"));
		
		Thread.sleep(3000);
		//Step1 : Downcast javascriptExecutor => to access executescript() and executeAsynchScript()
		JavascriptExecutor js = (JavascriptExecutor) wb ;
		
		Thread.sleep(3000);
		//Step2 : Call executeScript(String script,Object)
		js.executeScript("arguement[0].value='Pune'",textfield);
		
	}

}
