package package1;


import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class AssertStmt {

	@Test
	public void positiveDigit() {
		System.out.println("Welcome to jenkins world");
		int a=4,b=6;
		int c = a+b;
		if(c>0) {
			Assert.assertTrue(true);
			System.out.println("It is positive digit");
			System.out.println("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("It is negative digit");
			System.out.println("Test Case Failed");
		}

	}
	
	@Ignore 
	@Test
	public void failConsciously() {
			Assert.assertTrue(false);			

	}

}
