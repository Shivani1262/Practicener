package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		//Step1 : Create an object WebDriverWait class & in WebDriverWait constructor pass an arguments-webdriver reference
		WebDriverWait w = new WebDriverWait(wb,Duration.ofSeconds(2));
		
		wb.get("https://www.myntra.com/");
		
		String url = wb.getCurrentUrl();
		//Step2 : call until()
		//Step3 : Pass the predicate function(condition method) as arguments inside until() 
//		w.until(ExpectedConditions.urlToBe("https://www.myntra.com/pune"));			//TimeoutException
		w.until(ExpectedConditions.urlToBe("https://www.myntra.com/"));				//wait until getting expected url 
		System.out.println(url);
		System.out.println("Good Morning!");
	}

}
