package assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) wb ;
		
		Thread.sleep(3000);
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("./ajio/Homepage.png");	
		FileUtils.copyFile(temp, destinationfile) ;
		
		Thread.sleep(3000);
		wb.findElement(By.name("searchVal")).sendKeys("Watches");
		Thread.sleep(3000);
		wb.findElement(By.className("ic-search")).click();
		
		Thread.sleep(3000);
		File temp1 = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile1 = new File("./ajio/Watches.png");	
		FileUtils.copyFile(temp1, destinationfile1) ;
		
		Thread.sleep(3000);
		wb.findElement(By.xpath("//label[contains(text(),'Women')]")).click();
		
		Thread.sleep(3000);
		File te_mp = ts.getScreenshotAs(OutputType.FILE);
		File destination_file = new File("./ajio/WomenWatches.png");	
		FileUtils.copyFile(te_mp, destination_file) ;
		
		Thread.sleep(3000);
		wb.findElement(By.cssSelector("img[alt='Product image of Ted baker BKPFZF122 Analogue Watch with Leather Strap']")).click();
		Thread.sleep(3000);
		
		Set<String> ss = wb.getWindowHandles();
		for(String a : ss) {
			String url = wb.switchTo().window(a).getCurrentUrl();
			System.out.println(url);
			String childUrl = "https://www.ajio.com/ted-baker-bkpfzf122-analogue-watch-with-leather-strap/p/465858797_pink";
			
			if(url.contains(childUrl)) {
				break ;
			}
		}
		
		Thread.sleep(3000);
		File temp2 = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile2 = new File("./ajio/Watches1.png");	
		FileUtils.copyFile(temp2, destinationfile2) ;
		
		wb.findElement(By.xpath("(//img[@alt='Product image of Ted baker BKPFZF122 Analogue Watch with Leather Strap'])[1]")).click();
		Thread.sleep(3000);
		File temp3 = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile3 = new File("./ajio/Watches2.png");	
		FileUtils.copyFile(temp3, destinationfile3) ; 
		
		wb.findElement(By.xpath("(//img[@alt='Product image of Ted baker BKPFZF122 Analogue Watch with Leather Strap'])[2]")).click();
		Thread.sleep(3000);
		File temp4 = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile4 = new File("./ajio/Watches3.png");	
		FileUtils.copyFile(temp4, destinationfile4) ; 
		
		wb.findElement(By.xpath("(//img[@alt='Product image of Ted baker BKPFZF122 Analogue Watch with Leather Strap'])[3]")).click();
		Thread.sleep(3000);
		File temp5 = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile5 = new File("./ajio/Watches4.png");	
		FileUtils.copyFile(temp5, destinationfile5) ; 
		
	}

}
