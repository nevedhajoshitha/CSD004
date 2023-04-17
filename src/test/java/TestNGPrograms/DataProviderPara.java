package TestNGPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPara {

	@DataProvider(name = "passing_values")
	public Object[][] data(){
		return new Object[][] {{"welcome","all", 3},{"all","hello",5},{"bye","all",1} };
	}
	
	@Test(dataProvider = "passing_values")
	public void Sample(String str, String str1, int x) {
		System.out.println(str +" "+ str1);
		System.out.println("The number is : "+ x);
	}
}
