package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.facebook.com/");
		
	/*	Thread.sleep(2000);
		String str = wb.findElement(By.name("login")).getCssValue("align-items");
		System.out.println(str);		*/
		
		Thread.sleep(2000);
		String str1 = wb.findElement(By.name("login")).getCssValue("border-image-repeat");
		System.out.println(str1);	
		
	/*	Thread.sleep(2000);
		String str2 = wb.findElement(By.name("login")).getCssValue("font-family");
		System.out.println(str2);		*/

	}

}
