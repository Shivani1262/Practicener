package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args)  throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://letcode.in/test");
		
		Thread.sleep(3000);
		wb.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(3000);
		boolean tf = wb.findElement(By.id("noEdit")).isEnabled();
		System.out.print(tf);
	}

}
