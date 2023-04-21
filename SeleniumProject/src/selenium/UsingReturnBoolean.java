package selenium;

public class UsingReturnBoolean extends CodeForBrowserInitialization {
public boolean checktitleofpage(String title) {
		
		String titleofpage= driver.getTitle();
		if (titleofpage.equals(title)) 
			return true;
		else 
			return false;
	}
    public boolean checkurlofpage(String url) {
		
		String urlofpage= driver.getCurrentUrl();
		if (urlofpage.equals(url)) 
			return true;
		else 
			return false;
	}
      public static void main(String[]args) throws InterruptedException {
	browserInit("chrome");
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	GetTitleAndCurrentUrl ob=new GetTitleAndCurrentUrl();
	ob.checktitleofpage("Instagram");
	ob.checkurlofpage("https://www.instagram.com/");
	driver.quit();
	
}

}



