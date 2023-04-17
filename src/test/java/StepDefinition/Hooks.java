package StepDefinition;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	@Before
	public void Start() {
		WebDriverManager.edgedriver().setup();
	    
	}
	
	@After
	public void Stop() {
		System.out.println("Successfully executed");
	}
}
