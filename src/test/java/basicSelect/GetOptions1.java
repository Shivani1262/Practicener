package basicSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		Thread.sleep(3000);
		WebElement country = wb.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(country);
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions);
		
		for(WebElement str : allOptions ) {
		System.out.println(str.getText());		
		}
		
	}

}
