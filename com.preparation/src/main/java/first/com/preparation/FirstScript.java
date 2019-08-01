package first.com.preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstScript {
	
	
	
	WebDriver driver= new ChromeDriver();
	
		
	@Test
	void main()
	{
		
		driver.get("https://www.google.com");
		driver.quit();
		
		
	}

}
