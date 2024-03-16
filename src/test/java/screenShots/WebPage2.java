package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//To take current time
		LocalDateTime ldt = LocalDateTime.now();
		//To print Current Date Time and replace ':' char with '-' char
		 String dateTime = ldt.toString().replace(':', '-');
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) wb ;
		
		Thread.sleep(3000);
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("./myntra1/Homepage"+dateTime+".png");	
		FileUtils.copyFile(temp, destinationfile) ;
		
		Thread.sleep(2000);
		wb.findElement(By.className("desktop-searchBar")).sendKeys("Kurtis");
		Thread.sleep(3000);
		wb.findElement(By.className("desktop-submit")).click();
		
		Thread.sleep(3000);
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./myntra1/Kurtis"+dateTime+".png");	
		FileUtils.copyFile(temp1, destinationFile) ;
		
		Thread.sleep(3000);
		wb.findElement(By.xpath("//label[text()='Girls']")).click();
		
		Thread.sleep(3000);
		File temp2 = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile2 = new File("./myntra1/GirlsKurtisPage"+dateTime+".png");	
		FileUtils.copyFile(temp2, destinationFile2) ;

	}

}
