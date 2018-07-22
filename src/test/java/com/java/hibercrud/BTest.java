package com.java.hibercrud;

import org.testng.annotations.Test;

public class BTest {

	@Test
	public void b1test(){
		System.out.println("in b1test");
	}
	
	@Test(groups="A")
	public void b2test(){
		System.out.println("in b2test");
	}
	
	@Test
	public void b3test(){
		System.out.println("in b3test");
	}
	
	@Test
	public void b4test(){
		System.out.println("in b4test");
	}
	
	@Test(groups="A")
	public void b5test(){
		System.out.println("in b5test");
	}

}
