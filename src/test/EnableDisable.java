package test;

import org.testng.annotations.Test;

public class EnableDisable {

	@Test (enabled = true)
	public void one() {
		System.out.println("One");
	}

	@Test (enabled = true)
	public void two() {
		System.out.println("Two");
	}

	@Test (enabled = false)
	public void three() {
		System.out.println("Three");
	}

	@Test (enabled = false)
	public void four() {
		System.out.println("Four");
	}

}
