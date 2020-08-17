package Java;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	
	Dimension size;
    static String destDir;
    static DateFormat dateFormat;

	public static void main(String[] args) throws IOException {
	
		System.setProperty("web.chrome.drive", "/home/tushar/git/JavaPrograms/JavaProject/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.crm360.co.in/");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/tushar/git/JavaPrograms/JavaProject/Screeshots/screenshot.png"));
  
 
 	

	}

}
