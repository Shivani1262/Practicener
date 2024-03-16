package screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();
		wb.get("https://www.ajio.com/");
		Thread.sleep(3000);
		//Step1 : Downcast TakesScreenshot => to access the method getScreenshotAs()
		TakesScreenshot ts = (TakesScreenshot) wb ;
		Thread.sleep(3000);
		//Step2 : call getScreenshotAs() & store Screenshot in File
		File temp = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		
	/*   Step3 : to store screenshot inside the current Project 
		 Create the object of the file and in file pass the path of the folder(image)
		 dot (.) => current project & / => immediate child folder name : images & file name : ajio	*/
		
		File destinationfile = new File("./images/ajio.png");	
		Thread.sleep(2000);
		
		//Move the screenshot from temp location to destination location
//		temp.renameTo(destinationfile);
		
		//Step4 : it create folder  and call copyfile() => it will copy temp and move to destinationfile location
		FileUtils.copyFile(temp, destinationfile) ;
		
		//After Excution u have to refresh the project
		
		
	}

}
