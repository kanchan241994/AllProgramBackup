package actions;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckingFrame extends Screenshot {

		public static void main(String[] args) throws InterruptedException, IOException {
			//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/slider/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60)); 
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));

			WebElement source = driver.findElement(By.cssSelector("#slider span"));
			Actions act = new Actions(driver);
			act.clickAndHold(source).build().perform();
			act.moveToElement(source, 550, 0).release().build().perform();

			driver.switchTo().parentFrame();
			driver.findElement(By.linkText("Download")).click();
			Thread.sleep(2000);
			CheckingFrame ob = new CheckingFrame();
			ob.ScreenShotss("V");
			driver.quit();

		}



}
