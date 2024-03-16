package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	public static void main(String[] args)throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		wb.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//		Thread.sleep(3000);
	/*	boolean emailtf = wb.findElement(By.id("email")).isDisplayed();
		System.out.println(emailtf);  */
		Thread.sleep(3000);
		boolean passtf = wb.findElement(By.id("pass")).isDisplayed();		
		System.out.println(passtf);													//NoSuchElementException	
	}

}
