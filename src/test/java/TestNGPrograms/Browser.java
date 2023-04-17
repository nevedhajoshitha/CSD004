package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	WebDriver driver;
	
	@BeforeSuite 
	public void Open() {
		WebDriverManager.edgedriver().setup();
		System.out.println("executed first");
		
	}
	
	@AfterSuite
	public void afters() {
		System.out.println("executed at last");
	}

@AfterClass
public void Close() {
	driver.close();
}

@Test(priority = 1)
public void Google() {
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
}

@Test
@Ignore
public void Facebook() {
	
	//driver.get("https://www.fb.com/");
	throw new SkipException("skipped the test case");
}
}
