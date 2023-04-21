package selenium;

public class GetTitleAndCurrentUrl extends CodeForBrowserInitialization {
	
	public void checktitleofpage(String title) {
		
		String titleofpage= driver.getTitle();
		if (titleofpage.equals(title)) 
			System.out.println("pass");
		else 
			System.out.println("fail");
	}
    public void checkurlofpage(String url) {
		
		String urlofpage= driver.getCurrentUrl();
		if (urlofpage.equals(url)) 
			System.out.println("pass");
		else 
			System.out.println("fail");
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
