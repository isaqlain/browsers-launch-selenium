package ChromeLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLanunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation\\Server\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
	}

}
