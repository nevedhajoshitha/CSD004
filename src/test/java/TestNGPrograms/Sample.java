package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	WebDriver driver;

	
	@BeforeClass
	public void bc() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("after method");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	
	@AfterTest
	public void at() {
		System.out.println("after test");
	}
	
	@Test(groups = {"sample"},dependsOnGroups = {"simple"})
		public void Test1() {
		System.out.println("test case 1");
	}
	
	@Test(groups = {"simple"})
	public void Test2() {
		System.out.println("test case 2");
		
	}
	
	@Test(groups = {"sample"} )
	public void Test3() {
		System.out.println("test case 3");
	}
}
