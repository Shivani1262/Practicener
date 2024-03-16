package basicWebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrect_Location_size {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Dimension size = wb.findElement(By.id("email")).getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
//		Thread.sleep(5000);
		Point location = wb.findElement(By.id("email")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		
//		Thread.sleep(5000);
		Rectangle rect = wb.findElement(By.xpath("//a[text()='Create new account']")).getRect();
		System.out.println(rect.getWidth());
		System.out.println(rect.getHeight());
//		Thread.sleep(2000);
		System.out.println(rect.getX());
		System.out.println(rect.getY());
	}

}
