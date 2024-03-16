package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebPage4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		Thread.sleep(3000);
		
		//Step1 : Identify the webelement
		 WebElement women = wb.findElement(By.xpath("//span[text()='WOMEN']"));
		 Thread.sleep(3000);
		//Step2 : Create object of Actiona class
		//Step3 : pass webdriver referance as an argument to Actions constructor
		 Actions a = new Actions(wb);
		 Thread.sleep(3000);
		//Step4 : Mouse hover on men
		 a.moveToElement(women);
		 Thread.sleep(3000);
		 //Step5 : Call perform()
		 a.perform();
		 Thread.sleep(3000);
		 WebElement sf = wb.findElement(By.xpath("(//a[text()='Sunglasses & Frames'])[1]"));
		 Thread.sleep(3000);
		 a.click(sf);
		 a.perform();
		 
		 Thread.sleep(3000);
		 wb.findElement(By.cssSelector("img[alt='Product image of Vincent Chase Unisex UV Protected Sunglasses -VC S14506']")).click();
		 
		 Thread.sleep(3000);
		 Set<String> ss = wb.getWindowHandles();
			for(String str : ss) {
				String url = wb.switchTo().window(str).getCurrentUrl();
				System.out.println(url);
				String childUrl = "https://www.ajio.com/vincent-chase-unisex-uv-protected-sunglasses-vc-s14506/p/465010359_grey";
				
				if(url.contains(childUrl)) {
					break ;
				}
			}
		  Thread.sleep(3000);
		  wb.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		  Thread.sleep(3000);
		  wb.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		  
		  Thread.sleep(3000);
		  TakesScreenshot ts = (TakesScreenshot) wb ;
		  Thread.sleep(3000);
		  File temp = ts.getScreenshotAs(OutputType.FILE);
		  File destinationfile = new File("./ajio1/GO TO BAG.png");	
		  FileUtils.copyFile(temp, destinationfile) ; 
		 

	}

}
