package TestNGPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterPassing {
@Test
@Parameters({"x","y"})
public void add(int a, int b) {
	int c = a+b;
	System.out.println(c);
}
}
