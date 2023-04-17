package TestNGPrograms;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTestNG.class)
public class TestNG {

	@Test
	public void fun1() {
		System.out.println("hello all");
	}
	
	@Test
	public void fun2() {
		System.out.println("welcome all");
		Assert.assertTrue(false);
	}
	
	@Test
	public void fun3() {
		System.out.println("Bye all");
	}
	
	@Test
	public void fun4() {
		throw new SkipException("Test case skipped");
	}
}
