package alertandpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWinPopUp {
	public static void main(String[]args) throws InterruptedException {
		//System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("WebDriver.Edge.Driver","D:\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login_email1")).sendKeys("kanchan@gmail.com");
}
}