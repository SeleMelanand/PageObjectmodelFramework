package com.generaltestcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.ProjectWrapper;

public class Sampletestcase extends ProjectWrapper {

	@Test(dataProvider="inputdatafromexcel")
	public void test(String username , String password ) throws IOException {
		
		launchbrowser("chrome",extractdata("url") );
	
		WebElement uname = locateelemnet("id", extractdata("Login.UserName.Id"));
		typevaluetoidelement(uname, username);
		
		WebElement passcode= locateelemnet("id", extractdata("Login.password.Id"));
		typevaluetoidelement(passcode, password);
		
				
		WebElement sigin = locateelemnet("id", extractdata("Login.sigin.Id"));
		clickelementbyid(sigin);
		
		WebElement search = locateelemnet("id", extractdata("Homepage.Search.Id"));
		clickelementbyid(search);
		
		typevaluetoidelementmouseenter(search, "2018073199");
		
		WebElement documenttab = locateelemnet("xpath", extractdata("Homepage.DocumentTab.Xpath"));
		clickelementbyxpath(documenttab);
	}
	
}
