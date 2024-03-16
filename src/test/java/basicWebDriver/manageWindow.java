package basicWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.nykaa.com/");
/*		Thread.sleep(3000);
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.manage().window().minimize();
		Thread.sleep(3000);
		d.manage().window().fullscreen();   */
		Thread.sleep(3000);
		
//		To get the default height and width of the window
/*		Dimension a = d.manage().window().getSize();
		System.out.println(a);
		Thread.sleep(3000);
		System.out.println(a.getWidth());
		Thread.sleep(3000);
		System.out.println(a.getHeight());   */
		
		//To set the default height and width of the window
/*		 Thread.sleep(3000);
		 Dimension dm = new Dimension(350,450);
		 d.manage().window().setSize(dm);			*/
		
		//To get the default X and Y position of the window
/*  	Point p = d.manage().window().getPosition();
		System.out.println(p);
		System.out.println(p.getX());
		System.out.println(p.getY());  				*/
		
		//To Set the Position of X and Y axis
		Point p = new Point(300,350);
		d.manage().window().setPosition(p);
	}

}
