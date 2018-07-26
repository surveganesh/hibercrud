package com.java.hibercrud;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.java.myapp.report.AppTestReportGenerationListener;
import com.java.myapp.report.Retry;

@Listeners (AppTestReportGenerationListener.class)
public class Dtest {
	
	static int count =0;
	@AfterSuite
	public void d1test(){
		System.out.println("in d1test");
	}
	
	@Test(groups="A")
	public void d2test(){
		System.out.println("in d2test");
	}
	
	@Test(retryAnalyzer=Retry.class)  // if test fails retry till maxcount or pass
	public void d3test(){
		System.out.println("in d3test");
		if(count!=1){
			count++;
			int i=10/0;
		}else{
			
		}
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
