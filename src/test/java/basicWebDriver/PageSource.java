package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.tirabeauty.com/");
		Thread.sleep(3000);
		String str  = d.getPageSource();
		System.out.println(str);
		

	}

}
