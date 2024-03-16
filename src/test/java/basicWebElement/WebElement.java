package basicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException{
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://doodles.google/");
		Thread.sleep(3000);
		wb.findElement(By.cssSelector("button[class='glue-carousel__button glue-carousel__button--next interactive']")).click();
		Thread.sleep(5000);
		wb.findElement(By.cssSelector("button[class='glue-carousel__button glue-carousel__button--prev interactive']")).click();
	}

}
