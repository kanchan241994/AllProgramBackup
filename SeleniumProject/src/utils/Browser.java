package utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Browser {
	WebDriver driver;

	public Browser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
		}

	public void openUrl(String url) {

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}
	public WebDriver getDriver() {
		return driver;

	}
	
	public void captureScreenshot(String filename) throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		File source =scrnshot.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\kanch\\Documents\\notes screenshots\\"+filename+".png");
		FileHandler.copy(source, destination);
	}

}
