package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplayed {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		
        boolean verifysignupbtnenabled = driver.findElement(By.id("signup_button")).isEnabled();
        System.out.println(verifysignupbtnenabled);
        
        boolean verifysignupbtndisplayed = driver.findElement(By.id("signup_button")).isDisplayed();
        System.out.println(verifysignupbtndisplayed);
        

}
}