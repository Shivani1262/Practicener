package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		
	/*	Thread.sleep(2000);
		String searchtf = wb.findElement(By.className("desktop-searchBar")).getAttribute("placeholder");
		System.out.println(searchtf);  
		
		Thread.sleep(2000);
		String search = wb.findElement(By.className("desktop-searchBar")).getAttribute("class");
		System.out.println(search);
		
		Thread.sleep(2000);
		String searchTf = wb.findElement(By.className("desktop-searchBar")).getAttribute("reactid");
		System.out.println(searchTf);		*/

		Thread.sleep(2000);
		String searchValue = wb.findElement(By.className("desktop-searchBar")).getAttribute("shivani");
		System.out.println(searchValue);

	}

}
