package com.java.hibercrud;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.java.business.UserLogin;
import com.java.util.ReadfromExcelUtil;

public class PerformLoginTest {

	/*@DataProvider //(name = "getTestData")
	public Object[][] performLoginTest(){
		return ReadfromExcelUtil.getTestData();
	}
	
	@Test(dataProvider="performLoginTest", enabled=true)
	public void performLogin(String uname, String pwd, String emsg){
		UserLogin u=new UserLogin();
		String actualMessage = u.authenticateUser(uname, pwd);
		Assert.assertEquals(actualMessage, emsg);
	}
	*/
}
