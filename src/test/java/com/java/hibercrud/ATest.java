package com.java.hibercrud;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.java.myapp.report.AppTestReportGenerationListener;


@Listeners (AppTestReportGenerationListener.class)
public class ATest {

	@Test(priority=5)
	public void a1test(){
		System.out.println("in a1test");
	}
	
	@Test(priority=4)
	public void a2test(){
		System.out.println("in a2test");
	}
	
	@Test(priority=3)
	public void a3test(){
		System.out.println("in a3test");
	}
	
	@Test(groups="A", priority=2)
	public void a4test(){
		System.out.println("in a4test");
	}
	
	@BeforeSuite
	public void a5test(){
		System.out.println("in a5test");
	}

}
