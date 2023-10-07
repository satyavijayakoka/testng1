package testng1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class test12e {
	
	@Test(priority = 1)
	public void testFour() {
		System.out.println("test four");
	}
	@Ignore
	@Test(priority = 2)
	public void testFive() {
		System.out.println("test five");
	}
	@Test(priority = 3, enabled = false)
	public void testSix() {
		System.out.println("test six");
	}

}
