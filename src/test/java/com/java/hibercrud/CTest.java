package com.java.hibercrud;

import org.testng.annotations.Test;

public class CTest {

	@Test
	public void c1test(){
		System.out.println("in c1test");
	}
	
	@Test
	public void c2test(){
		System.out.println("in c2test");
	}
	
	@Test
	public void c3test(){
		System.out.println("in c3test");
	}
	
	@Test(groups="A")
	public void c4test(){
		System.out.println("in c4test");
	}
	
	@Test
	public void c5test(){
		System.out.println("in c5test");
	}

}
