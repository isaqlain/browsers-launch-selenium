package ChromeLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation\\Server\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();	

		Thread.sleep(3000);
		
		Dimension d = new Dimension(200,500);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		Point p = new Point(400,400);
		
		driver.manage().window().setPosition(p);
		
	}

}
