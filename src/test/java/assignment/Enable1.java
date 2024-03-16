package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://skillrary.com/");
		Thread.sleep(3000);
		wb.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(3000);
	}

}
