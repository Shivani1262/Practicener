package screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.pantaloons.com/");
		Thread.sleep(3000);
		wb.findElement(By.cssSelector("input[placeholder='Search for products and more...']")).sendKeys("Shoes");
		Thread.sleep(3000);
		wb.findElement(By.className("search-bar-content-textSearch-icon")).click();
		Thread.sleep(3000);
		wb.findElement(By.cssSelector("img[alt='Pink Hi-Top Sneakers']")).click();
		Thread.sleep(3000);
		WebElement button = wb.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		Thread.sleep(3000);
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) wb ;

		File temp = button.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("./pantaloons/ADD TO BAG.png");	
		FileUtils.copyFile(temp, destinationfile) ;
		

	}

}
