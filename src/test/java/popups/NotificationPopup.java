package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 WebDriver wb=new ChromeDriver();
			
			wb.manage().window().maximize();
			wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			wb.get("https://www.easemytrip.com/");
			
			Thread.sleep(3000);
			//Create the object of Robot class.
			Robot r = new Robot();
			
			//cancle 
			r.keyPress(KeyEvent.VK_TAB);								//Used to press the key in the keyboard
			r.keyRelease(KeyEvent.VK_TAB);								//Used to release the key in the keyboard
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
/*		     //Allow
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_TAB);								
			r.keyRelease(KeyEvent.VK_TAB);	
			
			//Block
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_TAB);								
			r.keyRelease(KeyEvent.VK_TAB);			*/
	}

}
