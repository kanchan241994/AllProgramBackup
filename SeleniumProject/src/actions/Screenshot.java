package actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static WebDriver driver;
	
	public void ScreenShotss(String filename) throws IOException {
		TakesScreenshot scrnshot = (TakesScreenshot)driver;
		File source =scrnshot.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\kanch\\Documents\\notes screenshots"+filename+".png");
		FileHandler.copy(source, destination);
	}


}
