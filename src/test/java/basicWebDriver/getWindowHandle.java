package basicWebDriver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		d.findElement(By.className("desktop-searchBar")).sendKeys("SunGlasses");
		Thread.sleep(3000);
		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		//to click on the img
		Thread.sleep(3000);
		d.findElement(By.cssSelector("img[alt='Voyage Unisex Square Sunglasses 58157MG2970']")).click();
		Thread.sleep(3000);
		//tpo get window id
		String parentId = d.getWindowHandle();
		Thread.sleep(3000);
		System.out.print(parentId);
		Thread.sleep(3000);
		//to get all window id
//     	Set<String> parentchildid = d.getWindowHandles();	
//     	Thread.sleep(3000);
//		System.out.println(parentchildid);
		Thread.sleep(3000);
		d.close();
		Thread.sleep(5000);
		d.quit();
		
		
		
	}

}
