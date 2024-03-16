package basicFindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		Thread.sleep(3000);
		
		List<WebElement> anchor = wb.findElements(By.tagName("a"));
		
		for (WebElement e : anchor) {
			System.out.println(e.getText());
		}
		
	}

}
