package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelector {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		
        WebElement btnradiofemale= driver.findElement(By.xpath("//span[text()='Female']//parent::label//input"));
        btnradiofemale.click();
        Thread.sleep(2000);
        System.out.println(btnradiofemale.isSelected());
        WebElement btnradiomale= driver.findElement(By.xpath("//span[text()='Male']//parent::label//input"));
        btnradiomale.click();
        Thread.sleep(2000);
        System.out.println(btnradiomale.isSelected());
        
}
}