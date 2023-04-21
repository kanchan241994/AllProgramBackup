package testngassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MethodsToRunTestCasesOnCurrentPage extends ExcludeInclude {
	//public static WebDriver driver;
	/*public void login(String usname,String pass) {
		System.out.println("enter "+usname);
		System.out.println("enter "+pass);
		System.out.println("click login");
	}*/
	public void login(String usname, String pass) {
		driver.findElement(By.id("Username")).sendKeys(usname);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
	}

	 String getPageText(String pageText) {
		 String text = driver.findElement(By.xpath("//h4[text()='" + pageText + "']")).getText();
		 return text;
	
	}
	 String getBlockOnDashBoard(String blockName) {
		 String text = driver.findElement(By.xpath("//h6[text()='" + blockName + "']")).getText();
		 return text;
	
	}
	 public void logout() {
		 System.out.println("logout code");
	 }


}
