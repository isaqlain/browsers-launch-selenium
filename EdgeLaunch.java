package EdgeLaunch;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Automation\\Automation\\Server\\msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
	}

}
