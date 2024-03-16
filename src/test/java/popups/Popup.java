package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new ChromeDriver();
		
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wb.get("https://licindia.in/");
		
		Thread.sleep(3000);
		wb.findElement(By.xpath("//button[text()='Close']")).click();
		
		Thread.sleep(3000);
		//To click on Pay Premium online
		wb.findElement(By.xpath("//span[text()=' Pay Premium ']")).click();
		
		Thread.sleep(3000);
		String str = wb.switchTo().alert().getText();
		System.out.println(str);
		
		Thread.sleep(3000);
//		wb.switchTo().alert().accept();
		
	}

}
