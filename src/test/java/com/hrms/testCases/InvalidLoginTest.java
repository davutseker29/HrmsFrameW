package com.hrms.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;



public class InvalidLoginTest extends CommonMethods{
	
	@Test
	public void invalidLogin() {
		
		sendText(login.username, ConfigsReader.getProperty("username") );
		sendText(login.password, "Asdasdasd");
		click(login.loginBtn);
		
		
		String expected="Invalid credentials";
		Assert.assertEquals(login.errorMsg.getText(), expected,"error");
		System.out.println("passed");
}
}