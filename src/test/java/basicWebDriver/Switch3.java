package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch3 {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
	    d.get("https://www.ajio.com/");
	    Thread.sleep(2000);
	    d.findElement(By.name("searchVal")).sendKeys("Watches");
	    Thread.sleep(2000);
	    d.findElement(By.className("ic-search")).click();
	    Thread.sleep(2000);
	    d.findElement(By.cssSelector("img[alt='Product image of Ted baker BKPDAF304 Analogue Watch with Pin-Tuck Clasp']")).click();
	    Thread.sleep(3000);
	    //To know how many windows are present 
	    Set<String> ids = d.getWindowHandles();
	    System.out.println(ids);
	    Thread.sleep(3000);
	    for(String str : ids) {
	    	String url = d.switchTo().window(str).getCurrentUrl();
	    	System.out.println(url);
	    	Thread.sleep(3000);
	    	String childUrl = "https://www.ajio.com/ted-baker-bkpdaf304-analogue-watch-with-pin-tuck-clasp/p/466593884_blue";
	    	Thread.sleep(3000);
	    	if(url.contains(childUrl)) {
	    		break;
	    	}
	    }
	    Thread.sleep(3000);
	    d.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	}

}
