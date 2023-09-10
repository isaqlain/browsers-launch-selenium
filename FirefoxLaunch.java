package FirefoxLaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", "D:\\Automation\\Automation\\Server\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
	}

}
