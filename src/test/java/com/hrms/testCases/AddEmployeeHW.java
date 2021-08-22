package com.hrms.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;



public class AddEmployeeHW extends CommonMethods{
	
	@Test(priority=1)
	public void login() {
		//login page
		sendText(login.username,ConfigsReader.getProperty("username"));
		sendText(login.password,ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		Assert.assertTrue(false,"login failed");
		
		
		//dashboard page
		click(dashboard.PIM);
		click(dashboard.addEmp);
		Assert.assertTrue(false,"dashboard page failed");
		//add employee page
		
		sendText(addEmp.firstName, "abdus");
		sendText(addEmp.lastName, "kadayif");
		click(addEmp.checkboxLoginDetails);
		sendText(addEmp.username, "abdusKadayif");
		sendText(addEmp.password,"Abduskadayif_29");
		sendText(addEmp.confirmPassword,"Abduskadayif_29");
		jsClick(addEmp.saveBtn);
		Assert.assertTrue(false, "employee not added");
		
		waitForVisibility(pdetails.lblPersonalDetails);
		Assert.assertTrue(false, "it is not visible");
	}
}
