package basicFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Documents/findElements.html");
//		driver.findElement(By.xpath("(//input[@value='A'])[1]")).sendKeys("Shivani");
//		List<WebElement> tf = driver.findElements(By.cssSelector("input[value='B']"));
		List<WebElement> text = driver.findElements(By.xpath("//input[@value='A' and @type='text' or @value='C']"));
		
		for(WebElement e : text) {
			Thread.sleep(2000);
			e.click();
		}
		
/*  	List<WebElement> btn = driver.findElements(By.xpath("//input[@value='A' and not(@type='button')]"));
		
		for(WebElement e : btn) {
			Thread.sleep(2000);
			e.click();
		}	               */
	}

}
