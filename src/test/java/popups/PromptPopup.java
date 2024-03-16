package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver wb=new ChromeDriver();
			
			wb.manage().window().maximize();
			wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			wb.get("https://letcode.in/test");
			
			//To click on Dialog
			wb.findElement(By.xpath("//a[text()='Dialog']")).click();
			
			Thread.sleep(2000);	
			wb.findElement(By.id("prompt")).click();
			Thread.sleep(2000);
			wb.switchTo().alert().sendKeys("Shiv_ani");
			Thread.sleep(2000);
			wb.switchTo().alert().accept();
	}

}
