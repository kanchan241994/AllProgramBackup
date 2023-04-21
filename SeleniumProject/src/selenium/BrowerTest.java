package selenium;

public class BrowerTest extends CodeForBrowserInitialization {
	
	public static void main(String[]args) {
		browserInit("edge");
		driver.get("https://www.instagram.com/");
	}

}
