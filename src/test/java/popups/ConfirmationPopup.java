package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver wb=new ChromeDriver();
		
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wb.get("https://letcode.in/test");
		
		//To click on Dialog
		wb.findElement(By.xpath("//a[text()='Dialog']")).click();
		
		Thread.sleep(2000);	
		wb.findElement(By.id("confirm")).click();
				
		Thread.sleep(2000);
		//To click on CANCLE button
//		wb.switchTo().alert().dismiss();
		
		String a = wb.switchTo().alert().getText();
		System.out.println(a);
	}

}
