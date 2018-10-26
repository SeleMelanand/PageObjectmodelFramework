package utilities;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.generalproject.genericwrappers.Wrapperclass;

public class ProjectWrapper extends Wrapperclass {

	@DataProvider(name = "inputdatafromexcel")
	public Object[][] getData() throws IOException {

		return Readdatafromdifferentfiles.datareading("Sheet1");

	}

	
	public void urllaunch() throws IOException {
		System.out.println("entered before class method");
		launchbrowser("chrome", extractdata("url"));

	}

}
