package basicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		//Step1 : Identifying targeted element
		WebElement month = wb.findElement(By.id("month"));
		
		//Step2 : Create the object of select class
		//Step3 : Select constructor pass the targeted element as an argument
		Select s = new Select(month);
		
		//select 
		s.selectByIndex(10);
	}

}
