package Java;

public class Selenium {
	
	//implicit wait 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//dropdown **************************
	Select drpCountry = new Select(driver.findElement(By.name("country")));
	drpCountry.selectByVisibleText("ANTARCTICA");
	
	//fream **************************
	driver.switchTo().frame("a077aa5e");		
	
	//switchwindow **************************
	String parentWindow= driver.getWindowHandle();
	List<String> allWindows = driver.getWindowHandles();
	for(String curWindow : allWindows){
	    driver.switchTo().window(curWindow);
	}
	driver.close();
	driver.switchTo().window(parentWindow);
	
	
	//##########################################
	
	String handle= driver.getWindowHandle();
	 
    System.out.println(handle);

    // Click on the Button "New Message Window"

    driver.findElement(By.name("New Message Window")).click();

    // Store and Print the name of all the windows open	              

    Set handles = driver.getWindowHandles();

    System.out.println(handles);

    // Pass a window handle to the other window

    for (String handle1 : driver.getWindowHandles()) {

    	System.out.println(handle1);

    	driver.switchTo().window(handle1);

    	}
    driver.close();
    
    
    
    // ALert 
    Alert myAlert = driver.switchTo().alert();
       myAlert.accept();


}
