package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		//Step1 : Create an object WebDriverWait class & in WebDriverWait constructor pass an arguments-webdriver reference
		WebDriverWait w = new WebDriverWait(wb,Duration.ofSeconds(2));
		
		wb.get("https://www.myntra.com/");
		wb.findElement(By.className("desktop-searchBar")).sendKeys("Wallet");
		wb.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		//fetch the url of current webpage-wallet page
		
		String walletUrl = wb.getCurrentUrl();
		System.out.println(walletUrl);
		//verify the url
//	    w.until(ExpectedConditions.urlContains("https://www.myntra.com/Wal"));			//TimeoutException
//		w.until(ExpectedConditions.urlContains("https://www.myntras.com/Wallet"));		//TimeoutException
//		w.until(ExpectedConditions.urlToBe("https://www.myntra.com/Wallets"));			//TimeoutException
		//click on women
		wb.findElement(By.xpath("//label[text()='Women']")).click();
	}

}
