package assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitFileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver wb=new ChromeDriver();
			
			wb.manage().window().maximize();
			wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			wb.get("https://demo.vtiger.com/vtigercrm/");
			Thread.sleep(3000);
			
		

	}

}
