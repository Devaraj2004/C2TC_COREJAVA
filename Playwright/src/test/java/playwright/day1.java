package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class day1 {
	public static void main(String[] args) {
		
		//launch the browser
		//to start the playwright engine
		Playwright playwright=Playwright.create();
		//If we want to open chrome
		//LaunchOptions lp=new LaunchOptions();
		//lp.setChannel("Edge");
		//lp.setHeadless(false);
		//Browser browser=playwright.chromium().launch(lp);
		Browser browser=playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)); //launch-browser return type
		Page page=browser.newPage();
		page.navigate("https://www.amazon.in/");
		String title=page.title();
		System.out.println("Page Title:"+title);
		//page.close();
		//browser.close();
		//playwright.close();
		
		
		
	}

}
