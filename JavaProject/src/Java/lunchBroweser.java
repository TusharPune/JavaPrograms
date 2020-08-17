package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchBroweser {

	public static void main(String[] args) {

		System.setProperty("web.chrome.drive", "/home/tushar/git/JavaPrograms/JavaProject/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.crm360.co.in/");
		driver.manage().window().maximize();
		driver.quit();

	}

}
