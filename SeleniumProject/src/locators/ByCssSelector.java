package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {
	public static void main(String[]args) {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://m.facebook.com/");
		driver.manage().window().maximize();
        
		driver.findElement(By.cssSelector("#m_login_email")).sendKeys("kanchanpatil");
		driver.findElement(By.cssSelector("#m_login_password")).sendKeys("kanchan24");
		driver.findElement(By.cssSelector("._54k8._52jh._56bs._56b_._28lf._9cow._56bw._56bu")).click();

}
}