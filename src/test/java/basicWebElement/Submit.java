package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
	/*	wb.get("https://www.ajio.com/");
		Thread.sleep(3000);
		wb.findElement(By.name("searchVal")).sendKeys("Bride Lehenga");
		Thread.sleep(3000);
		wb.findElement(By.className("ic-search")).submit(); */
		
		wb.get("https://www.facebook.com/");
		Thread.sleep(3000);
//		wb.findElement(By.name("login")).submit();
//		wb.findElement(By.xpath("//button[text()='Log in']")).submit();
		//when we use submit() the login page is work here but when we use click() Forgotten password? is work.
//		wb.findElement(By.xpath("//a[text()='Forgotten password?']")).click();			//submit()
		

	}

}
