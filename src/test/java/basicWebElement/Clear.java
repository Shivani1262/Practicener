package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//To search Textfield in webpage
		WebElement searchtf = wb.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		//Enter watches in searchtf
		Thread.sleep(5000);
		searchtf.sendKeys("Watches");
		Thread.sleep(6000);
		//clear the data in searchtf
		searchtf.clear();
	}

}
