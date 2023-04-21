package scrolling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    String winId1 = driver.getWindowHandle();
	    System.out.println("primary window id: " +winId1);
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	    Thread.sleep(2000);
		Set<String> allWinId =driver.getWindowHandles();
		for(String eachWinId:allWinId )
			System.out.println(eachWinId);
}
}