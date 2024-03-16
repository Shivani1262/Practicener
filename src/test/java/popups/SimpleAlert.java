package popups;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		
		WebDriver wb=new ChromeDriver();
		
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wb.get("https://letcode.in/test");
		
		//To click on Dialog
		wb.findElement(By.xpath("//a[text()='Dialog']")).click();
		
		wb.findElement(By.id("accept")).click();
		
		wb.switchTo().alert().accept();
		
	}

}
