package basicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy_Index {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://letcode.in/test");
		Thread.sleep(3000);
		
		wb.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		
		//Step1 : Identifying targeted element
		Thread.sleep(3000);
		WebElement country = wb.findElement(By.id("country"));
		Select s = new Select(country);
		s.selectByIndex(6);
	}

}
