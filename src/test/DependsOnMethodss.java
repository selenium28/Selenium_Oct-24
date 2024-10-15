package test;

import org.testng.annotations.Test;

public class DependsOnMethodss {
	
	@Test 
	public void login() {
		System.out.println("One");
	}

	@Test (dependsOnMethods = "login")
	public void DashPage() {
		System.out.println("Two");
	}

	@Test (dependsOnMethods = "DashPage")
	public void address() {
		System.out.println("Three");
	}

	@Test (dependsOnMethods = "address")
	public void payment() {
		System.out.println("Four");
	}

}
