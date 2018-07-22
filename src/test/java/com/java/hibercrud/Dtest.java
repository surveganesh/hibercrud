package com.java.hibercrud;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Dtest {

	@AfterSuite
	public void d1test(){
		System.out.println("in d1test");
	}
	
	@Test(groups="A")
	public void d2test(){
		System.out.println("in d2test");
	}
	
	@Test
	public void d3test(){
		System.out.println("in d3test");
	}
	
	@Test
	public void d4test(){
		System.out.println("in d4test");
	}
	
	@Test
	public void d5test(){
		System.out.println("in d5test");
	}

}
