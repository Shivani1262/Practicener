package basicSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://letcode.in/test");
		Thread.sleep(3000);
		
		wb.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		
		//Step1 : Identifying targeted element
		Thread.sleep(3000);
		WebElement dropdown = wb.findElement(By.id("superheros"));
		
		Thread.sleep(3000);
		//Step2 : Create the object of select class
		//Step3 : Select constructor pass the targeted element as an argument
		Select s = new Select(dropdown);
		
		Thread.sleep(3000);
		s.selectByVisibleText("Ant-Man");
		s.selectByVisibleText("Aquaman");
		s.selectByVisibleText("The Avengers");
		s.selectByVisibleText("Batman");
		
		Thread.sleep(3000);
		s.deselectAll();

	}

}
