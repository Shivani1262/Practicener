package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch4 {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/");
		Thread.sleep(3000);
		//identify searchtf
	    WebElement Searchtf = d.findElement(By.id("search"));
	    Thread.sleep(3000);
	    //search for perfume
	    Searchtf.sendKeys("Perfumes");
	    Thread.sleep(3000);
	    Searchtf.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    //click on img which u want
	    d.findElement(By.cssSelector("img[alt='Yves Saint Laurent | Yves Saint Laurent Mon Paris Eau De Parfum (90ml)']")).click();
	    Thread.sleep(3000);
	    //To know how many windows are present 
	    Set<String> ids = d.getWindowHandles();
	    System.out.println(ids);
	    Thread.sleep(3000);
	    //To transfer the control from parent window to child window
	    for(String str : ids) {
	    	String title = d.switchTo().window(str).getTitle();
	    	System.out.println(title);
	    	String childTitle = "Yves Saint Laurent Mon Paris Eau De Parfum (90ml)";
	    	if(title.contains("Tira: Shop Makeup, Skin, Hair & Beauty Products Online | www.tirabeauty.com\r\n"
	    			+ "Yves Saint Laurent Mon Paris Eau De Parfum (90ml)"))
	    	{
	    		break ;
	    	}
	    }
	    Thread.sleep(3000);
	    //Clicking on Add to Bag into child window
	    d.findElement(By.xpath("//span[text()='Add to Bag']")).click();  
	    Thread.sleep(3000);
	    //To transfer the control from child window to parent window
	    for(String str1 : ids) {
	    	String titles = d.switchTo().window(str1).getTitle();
	    	System.out.println(titles);
	    	
	    	String parentTitle = "Tira: Shop Makeup, Skin, Hair & Beauty Products Online | www.tirabeauty.com" ;
	    	if(titles.contains(parentTitle)) {
	    		break ;
	    	}
	    	
	    }
	    Thread.sleep(3000);
	    //clicking on brand
	    d.findElement(By.xpath("//span[text()='Brand']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//div[text()=' Engage ']")).click();
	    
	}
}
