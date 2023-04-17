package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener{

	public void onStart(ITestContext context) {
		System.out.println("Execution started");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Execution finished");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}
	
	public void onTestSkip(ITestResult result) {
		System.out.println("Test skipped");
	}
}
