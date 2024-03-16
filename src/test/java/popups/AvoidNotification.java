package popups;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidNotification {

	public static void main(String[] args) throws AWTException {
			
			//Steps to avoid notification popup
			
			//Step1 : Create object of chromeoptions class
			ChromeOptions op = new ChromeOptions();
			
			//Step2 : call addArguements(String Arguements)
			op.addArguments("--disable-notifications");
			
			//Step3 : Create ChromeDriver object by passing ChromeOptions refrence in it.
			WebDriver wb = new ChromeDriver(op);
			
			wb.get("https://www.easemytrip.com/");
	}

}
