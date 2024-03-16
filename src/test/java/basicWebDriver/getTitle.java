package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.ajio.com/");
		Thread.sleep(2000);
		//to get the title of the current webPage
		String actualtitle = d.getTitle();
		Thread.sleep(2000);
		System.out.println(actualtitle);
		Thread.sleep(2000);
		//to enter perfume in the search tf
		d.findElement(By.name("searchVal")).sendKeys("Perfumes");
		//to click on search icon
		Thread.sleep(2000);
		d.findElement(By.className("ic-search")).click();
		//to get the title of the current webpage
		Thread.sleep(2000);
		String perfumespaage = d.getTitle();
		Thread.sleep(2000);
		System.out.print(perfumespaage);

	}

}
