package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		
		Thread.sleep(3000);
		wb.findElement(By.name("searchVal")).sendKeys("Watches");
		Thread.sleep(3000);
		wb.findElement(By.className("ic-search")).click();
		Thread.sleep(3000);
		wb.findElement(By.xpath("//label[text()='Girls (36)']")).click();
		Thread.sleep(3000);
		boolean text = wb.findElement(By.xpath("//label[text()='Girls (36)']")).isSelected();
		System.out.print(text);
		
	}

}
