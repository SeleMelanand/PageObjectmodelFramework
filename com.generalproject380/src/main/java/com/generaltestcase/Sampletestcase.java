package com.generaltestcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.ProjectWrapper;

public class Sampletestcase extends ProjectWrapper {

	@Test(dataProvider="inputdatafromexcel")
	public void test(String username , String password ) throws IOException {
		
		launchbrowser("chrome",extractdata("url") );
	
		WebElement search = locateelemnet("id", extractdata("Homepage.Search.Id"));
		clickelementbyid(search);
		
		typevaluetoidelementmouseenter(search, "2018073199");
		
		WebElement documenttab = locateelemnet("xpath", extractdata("Homepage.DocumentTab.Xpath"));
		clickelementbyxpath(documenttab);
	}
	
}
