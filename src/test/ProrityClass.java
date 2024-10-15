package test;

import org.testng.annotations.Test;

public class ProrityClass {

	@Test (priority = 1)
	public void one() {
		System.out.println("One");
	}

	@Test (priority = -2)
	public void two() {
		System.out.println("Two");
	}

	@Test (priority = 3)
	public void three() {
		System.out.println("Three");
	}

	@Test (priority = 0)
	public void four() {
		System.out.println("Four");
	}

}
