package com.generalproject.genericwrappers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.Readdatafromdifferentfiles;

public class Wrapperclass extends Readdatafromdifferentfiles {

	public static RemoteWebDriver driver;

	// Launching browser method , Enter the browser url and which browser should be
	// used for testing need to be given as input
	public void launchbrowser(String browsername, String url) {

		try {
			switch (browsername) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				break;

			case "internetexplorer":
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				break;

			case "firefox":
				System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				break;

			}
			System.out.println("Browser launched successfully");
		} catch (Exception e) {
			System.out.println("Unable to load the URL" + e);
		}

	}

	// Locating the elemnets in web page using differnt locators and its respective
	// values
	public WebElement locateelemnet(String locatordetails, String locatorvalue) {

		switch (locatordetails) {
		case "id":
			return driver.findElementById(locatorvalue);
		case "class":
			return driver.findElementByClassName(locatorvalue);
		case "name":
			return driver.findElementByName(locatorvalue);
		case "linktext":
			return driver.findElementByLinkText(locatorvalue);
		case "partiallinktext":
			return driver.findElementByPartialLinkText(locatorvalue);
		case "xpath":
			return driver.findElementByXPath(locatorvalue);
		}
		return null;

	}

	// enter value for a webelement identified by id
	public void typevaluetoidelement(WebElement element, String valuetoenter) {

		try {
			element.clear();
			element.sendKeys(valuetoenter);
			System.out.println("text value entered in the given field : " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// enter value for a webelement identified by id and enter using mouse
	public void typevaluetoidelementmouseenter(WebElement element, String valuetoenter) {

		try {
			element.clear();
			element.sendKeys(valuetoenter, Keys.ENTER);
			System.out.println("text value entered in the given field : " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// enter value for a webelement identified by classname
	public void typevaluetoclasselement(WebElement element, String valuetoenter) {

		try {
			element.clear();
			element.sendKeys(valuetoenter);
			System.out.println("text value entered in the given field : " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// enter value for a webelement identified by name
	public void typevaluetonameelement(WebElement element, String valuetoenter) {

		try {
			element.clear();
			element.sendKeys(valuetoenter);
			System.out.println("text value entered in the given field : " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// enter value for a webelement identified by xpath
	public void typevaluetoxpathelement(WebElement element, String valuetoenter) {

		try {
			element.clear();
			element.sendKeys(valuetoenter);
			System.out.println("text value entered in the given field : " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Click the webelement identified by id
	public void clickelementbyid(WebElement element) {

		try {
			element.click();
			System.out.println("Element selected successfully: " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Click the webelement identified by classname
	public void clickelementbyclassname(WebElement element) {

		try {
			element.click();
			System.out.println("Element selected successfully: " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Click the webelement identified by name
	public void clickelementbyname(WebElement element) {

		try {
			element.click();
			System.out.println("Element selected successfully: " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Click the webelement identified by xpath
	public void clickelementbyxpath(WebElement element) {

		try {
			element.click();
			System.out.println("Element selected successfully: " + element);

		} catch (Exception e) {
			System.out.println("Unable to identify the element and enter the value" + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Select a value using visible text for element identified by id
	public void selectvalueforidelement(WebElement element, String visibletext) {
		try {
			Select selectval = new Select(element);
			selectval.selectByVisibleText(visibletext);
			System.out.println("Given value selected in UI ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to select the value " + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Select a value using visible text for element identified by classname
	public void selectvalueforclassnameelement(WebElement element, String visibletext) {
		try {
			Select selectval = new Select(element);
			selectval.selectByVisibleText(visibletext);
			System.out.println("Given value selected in UI ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to select the value " + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Select a value using visible text for element identified by name
	public void selectvaluefornameelement(WebElement element, String visibletext) {
		try {
			Select selectval = new Select(element);
			selectval.selectByVisibleText(visibletext);
			System.out.println("Given value selected in UI ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to select the value " + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Select a value using visible text for element identified by xpath
	public void selectvalueforxpathelement(WebElement element, String visibletext) {
		try {
			Select selectval = new Select(element);
			selectval.selectByVisibleText(visibletext);
			System.out.println("Given value selected in UI ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unable to select the value " + e);
		} finally {
			// screenshot need to be taken
		}
	}

	// Retrieving text value from the webelement
	public String getvaluefromwebelement(WebElement element) {
		String textvalue = null;
		try {
			textvalue = element.getText();
			System.out.println("Value retrieved successfully" + textvalue);
		} catch (Exception e) {
			System.out.println("Unable to retrieve the value" + e);
		}
		return textvalue;
	}

}
