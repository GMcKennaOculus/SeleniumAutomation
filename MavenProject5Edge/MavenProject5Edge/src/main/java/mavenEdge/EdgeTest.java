package mavenEdge;

import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {

	public EdgeTest() {
	System.setProperty("webdriver.edge.driver","C:/Users/gmcke/oculus/automation/Drivers/Edge/edgedriver_win64/msedgedriver.exe");
	
	
	EdgeDriver ed = new EdgeDriver();
	try {
		ed.wait(1000);
	}catch(Exception e){
	}
	ed.get("https://www.cnn.com");
	try {
		Thread.sleep(5000);
	}catch(Exception e){
	}
	ed.close();
	}
	
	}
