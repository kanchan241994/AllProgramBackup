package datepicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();

			driver.get("https://demo.automationtesting.in/Datepicker.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.id("datepicker2")).click();
			Thread.sleep(2000);
			driver.findElements(By.cssSelector("select[title=\"Change the year\"] option")).get(0).click();
			WebElement year = driver.findElement(By.xpath("//*[@title='Change the year']"));
				Select y= new Select(year);
				y.selectByVisibleText("1994");
				Thread.sleep(2000);
				WebElement month = driver.findElement(By.xpath("//*[@title='Change the month']"));
				Select m= new Select(month);
				m.selectByVisibleText("December");
				Thread.sleep(2000);
				 List<WebElement> date = driver.findElements(By.xpath("//table//tr/td//a"));
				 for(WebElement d:date)
					 if(d.getText().equals("24"))
					d.click();
	    
	}	    

}
