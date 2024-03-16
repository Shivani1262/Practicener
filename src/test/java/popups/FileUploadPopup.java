package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver wb=new ChromeDriver();
			
			wb.manage().window().maximize();
			wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			wb.get("https://demo.guru99.com/test/upload/");
			
			Thread.sleep(3000);
			wb.findElement(By.id("file_wraper0")).click();
			
			Thread.sleep(3000);
			//Location\\filename.extention
			Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\Selenium_Practice.exe");
	}
}
