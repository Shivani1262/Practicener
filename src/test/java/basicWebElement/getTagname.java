package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.facebook.com/");
		Thread.sleep(3000);
//		String str = wb.findElement(By.xpath("//a[text()='Forgotten password?']")).getTagName();
//		System.out.print(str);
		String str = wb.findElement(By.name("login")).getTagName();
		System.out.print(str);
	}

}
