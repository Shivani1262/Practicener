package basicWebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		boolean searchtf = wb.findElement(By.name("searchVal")).isEnabled();
		System.out.println(searchtf);
		
		Thread.sleep(3000);
	    wb.findElement(By.name("searchVal")).sendKeys("Bags");
	    Thread.sleep(3000);
		wb.findElement(By.className("ic-search")).click();
		
		Thread.sleep(3000);
		wb.findElement(By.cssSelector("img[alt='Product image of Women Marks Women Logo Print Sling Bag with Adjustable Strap']")).click();
		
		Thread.sleep(3000);
		Set<String> ids = wb.getWindowHandles();
		for(String str : ids)
		{
			String url = wb.switchTo().window(str).getCurrentUrl();
			String childUrl = "https://www.ajio.com/women-marks-women-logo-print-sling-bag-with-adjustable-strap/p/466750177_peach";
			
			if(url.contains(childUrl)) {
				break ;
			}
		}
		
		Thread.sleep(3000);
		//To check add to bag button is Enable or disable
		boolean button = wb.findElement(By.xpath("//span[text()='ADD TO BAG']")).isEnabled();
		System.out.println(button);
		
		 Thread.sleep(3000);
		 wb.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		 Thread.sleep(3000);
		 wb.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		 Thread.sleep(3000);
		 boolean radiobutton = wb.findElement(By.id("GET400")).isSelected();
		 System.out.print(radiobutton);
	}

}
