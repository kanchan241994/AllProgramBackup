package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCheck {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("isAgeSelected")).click();
		boolean verifycheckisselected= driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(verifycheckisselected);
		
		driver.findElement(By.id("isAgeSelected")).click();
		boolean verifycheckboxisselected= driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(verifycheckboxisselected);


}
}