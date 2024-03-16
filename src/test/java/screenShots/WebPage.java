package screenShots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		//Step1 : Downcast TakesScreenshot => to access the method getScreenshotAs()
		TakesScreenshot ts = (TakesScreenshot) wb ;
		Thread.sleep(3000);
		//Step2 : call getScreenshotAs() & store Screenshot in File
		File temp = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		//Step3 : call getabsolutepath() to know the location of screenshot
//		System.out.print(temp.getAbsolutePath());			//It gives the complete path of the ss
		
		/* Step to store screenshot inside the current Project */
		/* Create the object of the file and in file pass the path of the folder(image)
		dot (.) => current project & / => immediate child
		folder name : images & file name : myntra			*/
		File destinationfile = new File("./images/myntra.png");	
		Thread.sleep(2000);
		//Move the screenshot from temp location to destination location
		temp.renameTo(destinationfile);
		
		//After Excution u have to refresh ur project
		
	}

}
