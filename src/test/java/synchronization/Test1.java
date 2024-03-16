package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		
		wb.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); 
		
		wb.get("https://www.myntra.com/");
		
		String url = wb.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.myntra.com/pune"))					 //if(url.equals("https://www.myntra.com/Pune"))
		{
			System.out.println("True");  		//satisfied
		}
		else {
			System.out.println("False");	//not satisified
		}
		System.out.println("Good morning!!");	
	}

}
