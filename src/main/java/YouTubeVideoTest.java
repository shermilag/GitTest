import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class YouTubeVideoTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.youtube.com/watch?v=cOUfbDT3Y7M");
		
		//create the object of screen class -sikuli
		
	    
		// Screen s = new Screen();
		// Pattern pauseImg =  new Pattern("Youtube Pause.PNG");
		// s.wait(pauseImg,2000);
		// s.click();
		// s.click();
		
		// Pattern settingImg =  new Pattern("Youtube settings.PNG");
		// s.wait(settingsImg,2000);
		// s.click();
	    // s.click();
		 
		
		
		
		 
	

	}

}
