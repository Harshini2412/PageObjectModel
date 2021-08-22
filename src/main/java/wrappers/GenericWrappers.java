package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {

	public RemoteWebDriver driver;
	
	int i=1;
	
	String modifiedXPath = null;
	
	public static Properties prop;
	
	public void loadObjects() {
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadObject() {
		prop=null;
	}
	
	
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver= new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver(); 
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched successfully with the given url "+url);
			
			reportStep("The browser "+browser+" is launched successfully with the given url "+url, "pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched successfully due to session not created error");
			
			reportStep("The browser "+browser+" is not launched successfully due to session not created error", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched successfully due to unknown error");
			
			reportStep("The browser "+browser+" is not launched successfully due to unknown error", "fail");
		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not present in the DOM");
			
			reportStep("The element with id "+idValue+" is not present in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
			
		}catch (WebDriverException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with the data "+data);
			reportStep("The element with name "+nameValue+" is entered with the data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not present in the DOM");
			reportStep("The element with name "+nameValue+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with the data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with the data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not present in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if (actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with the expected title "+title, "pass");
			} else {
				//System.out.println("The title of the page "+actualTitle+" is not matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+" is not matched with the expected title "+title, "pass");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is unable to verify due to unknown error");
			reportStep("The title of the page "+title+" is unable to verify due to unknown error", "fail");
		} 
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if (actualText.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualText+" is matching with the expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is matching with the expected text "+text, "pass");
			} else {
				//System.out.println("The element with id "+id+" is holding the text "+actualText+" is not matching with the expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is not matching with the expected text "+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not present in the DOM");
			reportStep("The element with id "+id+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+id+" which holds the text "+text+" is unable to verify due to unknown error");
			reportStep("The element with id "+id+" which holds the text "+text+" is unable to verify due to unknown error", "fail");
		} 
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is matching with the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is matching with the expected text "+text, "pass");
			}else {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not matching with the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not matching with the expected text "+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not present in the DOM");
			reportStep("The element with xpath "+xpath+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element with ixpath "+xpath+" is not stable in the application");
			reportStep("The element with ixpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" which holds the text "+text+" is unable to verify due to unknown error");
			reportStep("The element with xpath "+xpath+" which holds the text "+text+" is unable to verify due to unknown error", "fail");
		} 
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is containing the text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is containing the text "+text, "pass");
			} else {
			//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not containing with the text "+text);
			reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not containing with the text "+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not present in the DOM");
			reportStep("The element with xpath "+xpath+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element with ixpath "+xpath+" is not stable in the application");
			reportStep("The element with ixpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" which holds the text "+text+" is unable to verify due to unknown error");
			reportStep("The element with xpath "+xpath+" which holds the text "+text+" is unable to verify due to unknown error", "fail");
		} 
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked successfully");
			reportStep("The element with id "+id+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not present in the DOM");
			reportStep("The element with id "+id+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clickable in the application");
			reportStep("The element with id "+id+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clickable in the application due to unknown reason");
			reportStep("The element with id "+id+" is not clickable in the application due to unknown reason", "fail");
		} 
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is clicked successfully");
			reportStep("The element with classname "+classVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+classVal+" is not present in the DOM");
			reportStep("The element with classname "+classVal+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not visible in the application");
			reportStep("The element with classname "+classVal+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not stable in the application");
			reportStep("The element with classname "+classVal+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clickable in the application");
			reportStep("The element with classname "+classVal+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not interactable in the application");
			reportStep("The element with classname "+classVal+" is not interactable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clickable in the application due to unknown reason");
			reportStep("The element with classname "+classVal+" is not clickable in the application due to unknown reason", "fail");
		} 
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked successfully");
			reportStep("The element with name "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not present in the DOM");
			reportStep("The element with name "+name+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application");
			reportStep("The element with name "+name+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clickable in the application");
			reportStep("The element with name "+name+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clickable in the application due to unknown reason");
			reportStep("The element with name "+name+" is not clickable in the application due to unknown reason", "fail");
		} 
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked successfully");
			reportStep("The element with link "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not present in the DOM");
			reportStep("The element with link "+name+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application");
			reportStep("The element with link "+name+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clickable in the application");
			reportStep("The element with link "+name+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clickable in the application due to unknown reason");
			reportStep("The element with link "+name+" is not clickable in the application due to unknown reason", "fail");
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked successfully");
			reportStep("The element with link "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not present in the DOM");
			reportStep("The element with link "+name+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application");
			reportStep("The element with link "+name+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clickable in the application");
			reportStep("The element with link "+name+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clickable in the application due to unknown reason");
			reportStep("The element with link "+name+" is not clickable in the application due to unknown reason", "fail");
		} 
	}

	
	
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not present in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application due to unknown reason");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application due to unknown reason", "fail");
		} 
	}


	
	
	public void clickByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			
			
		if(xpathVal.contains("option")) {
			 modifiedXPath = xpathVal.replace("option", value);
			 //System.out.println(modifiedXPath);
		}
			driver.findElementByXPath(modifiedXPath).click();
			//System.out.println(modifiedXPath);
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+modifiedXPath+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not present in the DOM");
			reportStep("The element with xpath "+modifiedXPath+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+modifiedXPath+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+modifiedXPath+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+modifiedXPath+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+modifiedXPath+" is not interactable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application due to unknown reason");
			reportStep("The element with xpath "+modifiedXPath+" is not clickable in the application due to unknown reason", "fail");
		}  finally {
			takeSnap();
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualtext =	null;
		try {
			actualtext = driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" holds the text "+actualtext);
			reportStep("The element with id "+idVal+" holds the text "+actualtext, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not present in the DOM");
			reportStep("The element with id "+idVal+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not able to get the text due to unknown error");
			reportStep("The element with id "+idVal+" is not able to get the text due to unknown error", "fail");
		} 
		return actualtext;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualtext =	null;
		try {
			actualtext = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with id "+xpathVal+" holds the text "+actualtext);
			reportStep("The element with id "+xpathVal+" holds the text "+actualtext, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not present in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element with ixpath "+xpathVal+" is not stable in the application");
			reportStep("The element with ixpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not able to get the text due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not able to get the text due to unknown error", "fail");
		} 
		
		return actualtext;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selByVisibletext = driver.findElementById(id);
			Select sel = new Select(selByVisibletext);
			sel.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" has successfully selected the visible text "+value+" from the dropdown");
			reportStep("The element with id "+id+" has successfully selected the visible text "+value+" from the dropdown", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not present in the DOM");
			reportStep("The element with id "+id+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable in the application");
			reportStep("The element with id "+id+" is not selectable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable in the application due to unknown reason");
			reportStep("The element with id "+id+" is not selectable in the application due to unknown reason", "fail");
		} 
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement selByIndex = driver.findElementById(id);
			Select sel = new Select(selByIndex);
			sel.selectByIndex(value);
			//System.out.println("The element with id "+id+" has successfully selected the index "+value+" from the dropdown");
			reportStep("The element with id "+id+" has successfully selected the index "+value+" from the dropdown", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not present in the DOM");
			reportStep("The element with id "+id+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable in the application");
			reportStep("The element with id "+id+" is not selectable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable in the application due to unknown reason");
			reportStep("The element with id "+id+" is not selectable in the application due to unknown reason", "fail");
		} 
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set <String> eachWinIdAfterClick = driver.getWindowHandles();
			for (String eachId : eachWinIdAfterClick) {
				driver.switchTo().window(eachId);
				break;
			}
			//System.out.println("Switched to Parent Window "+eachWinIdAfterClick+" successfully");
			reportStep("Switched to Parent Window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to switch to parent window as the window cannot be found");
			reportStep("Unable to switch to parent window as the window cannot be found", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to parent window due to unknow error");
			reportStep("Unable to switch to parent window due to unknow error", "fail");
		} 
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set <String> eachWinIdAfterClick = driver.getWindowHandles();
			for (String eachId : eachWinIdAfterClick) {
				driver.switchTo().window(eachId);
			}//System.out.println("Switched to Last Window "+eachWinIdAfterClick+" successfully");
			reportStep("Switched to Last Window successfully", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to switch to last window as the window cannot be found");
			reportStep("Unable to switch to last window as the window cannot be found", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to lat window due to unknow error");
			reportStep("Unable to switch to lat window due to unknow error", "fail");
		}
	
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted successfully");
			reportStep("The alert is accepted successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			///System.err.println("Unable to accept the alert as it is not present");
			reportStep("Unable to accept the alert as it is not present", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert in the application is not handled");
			reportStep("The alert in the application is not handled", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not accepted due to unknown error");
			reportStep("The alert is not accepted due to unknown error", "fail");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is dismissed successfully");
			reportStep("The alert is dismissed successfully", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to dismiss the alert as it is not present");
			reportStep("Unable to dismiss the alert as it is not present", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The alert in the application is not handled");
			reportStep("The alert in the application is not handled", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not dismissed due to unknown error");
			reportStep("The alert is not dismissed due to unknown error", "fail");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
			//System.out.println("The alert holds the text" +alertText);
			reportStep("The alert holds the text" +alertText, "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to get the text from the alert as the alert is not present");
			reportStep("Unable to get the text from the alert as the alert is not present", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to get the text from the alert due to unknown error");
			reportStep("Unable to get the text from the alert due to unknown error", "fail");
		}
		return alertText;
 
}

	public long takeSnap() {
		// TODO Auto-generated method stub
	
		long number = 0;
		try {
			
		number =	(long) (Math.floor(Math.random()*100000000)+100000);
			
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./report/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
			//System.out.println("Screenshot is taken successfully");
		//	reportStep("Screenshot is taken successfully", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to take screenshot due to unknown error");
			//reportStep("Unable to take screenshot due to unknown error", "fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to take screenshot due to IOException");
			//reportStep("Unable to take screenshot due to IOException", "fail");
		}	
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The browser is closed successfully");
			reportStep("The browser is closed successfully", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "fail");
		} 
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("The browsers are closed successfully");
			reportStep("The browsers are closed successfully", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browsers are not closed due to unknown error");
			reportStep("The browsers are not closed due to unknown error", "fail", false);
		} 
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("Thread waited for time "+time+" successfully");
			reportStep("Thread waited for time "+time+" successfully", "pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("Thread is unable to wait due to interrupted error");
			reportStep("Thread is unable to wait due to interrupted error", "fail");
		}
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selByVisibletext = driver.findElementByXPath(xpath);
			Select sel = new Select(selByVisibletext);
			sel.selectByVisibleText(value);
			//System.out.println("The element with xpath "+xpath+" has successfully selected the visible text "+value+" from the dropdown");
			reportStep("The element with xpath "+xpath+" has successfully selected the visible text "+value+" from the dropdown", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not present in the DOM");
			reportStep("The element with xpath "+xpath+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selectable in the application");
			reportStep("The element with xpath "+xpath+" is not selectable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selectable in the application due to unknown reason");
			reportStep("The element with xpath "+xpath+" is not selectable in the application due to unknown reason", "fail");
		} 
		
	}

	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selByValue = driver.findElementById(id);
			Select sel = new Select(selByValue);
			sel.selectByValue(value);
			//System.out.println("The element with id "+id+" has successfully selected the value "+value+" from the dropdown");
			reportStep("The element with id "+id+" has successfully selected the value "+value+" from the dropdown", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not present in the DOM");
			reportStep("The element with id "+id+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable in the application");
			reportStep("The element with id "+id+" is not selectable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selectable in the application due to unknown reason");
			reportStep("The element with id "+id+" is not selectable in the application due to unknown reason", "fail");
		} 
		
	}

	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selByValue = driver.findElementByXPath(xpath);
			Select sel = new Select(selByValue);
			sel.selectByValue(value);
			//System.out.println("The element with xpath "+xpath+" has successfully selected the value "+value+" from the dropdown");
			reportStep("The element with xpath "+xpath+" has successfully selected the value "+value+" from the dropdown", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not present in the DOM");
			reportStep("The element with xpath "+xpath+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selectable in the application");
			reportStep("The element with xpath "+xpath+" is not selectable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not selectable in the application due to unknown reason");
			reportStep("The element with xpath "+xpath+" is not selectable in the application due to unknown reason", "fail");
		} 
		
	}

	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selByValue = driver.findElementByName(name);
			Select sel = new Select(selByValue);
			sel.selectByValue(value);
			//System.out.println("The element with name "+name+" has successfully selected the value "+value+" from the dropdown");
			reportStep("The element with name "+name+" has successfully selected the value "+value+" from the dropdown", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not present in the DOM");
			reportStep("The element with name "+name+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application");
			reportStep("The element with name "+name+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selectable in the application");
			reportStep("The element with name "+name+" is not selectable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selectable in the application due to unknown reason");
			reportStep("The element with name "+name+" is not selectable in the application due to unknown reason", "fail");
		} 
		
	}

	public void pageDown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The pagedown key has been pressed successfully");
			reportStep("The pagedown key has been pressed successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath //html/body is not present in the DOM");
			reportStep("The element with xpath //html/body is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not visible in the application");
			reportStep("The element with xpath //html/body is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not interactable in the application");
			reportStep("The element with xpath //html/body is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not stable in the application");
			reportStep("The element with xpath //html/body is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The pagedown key has not been pressed due to unknown error");
			reportStep("The pagedown key has not been pressed due to unknown error", "fail");
		} 
	}

	public void pressTab() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
			//System.out.println("The tab key has been pressed successfully");
			reportStep("The tab key has been pressed successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath //html/body is not present in the DOM");
			reportStep("The element with xpath //html/body is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not visible in the application");
			reportStep("The element with xpath //html/body is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not interactable in the application");
			reportStep("The element with xpath //html/body is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not stable in the application");
			reportStep("The element with xpath //html/body is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The tab key has not been pressed due to unknown error");
			reportStep("The tab key has not been pressed due to unknown error", "fail");
		} 
	}

	public void mouseHoverByXpath(String xpathValue) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			WebElement element = 	driver.findElementByXPath(xpathValue);
			builder.moveToElement(element).build().perform();
			//System.out.println("The element with xpath "+xpathValue+" is hovered by mouse successfully");
			reportStep("The element with xpath "+xpathValue+" is hovered by mouse successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not present in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not hovered by mouse due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not hovered by mouse due to unknown error", "fail");
		} 
	}

	
	public void pressDownArrow() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.ARROW_DOWN);
			//System.out.println("The tab key has been pressed successfully");
			reportStep("The Arrow down key has been pressed successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath //html/body is not present in the DOM");
			reportStep("The element with xpath //html/body is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not visible in the application");
			reportStep("The element with xpath //html/body is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not interactable in the application");
			reportStep("The element with xpath //html/body is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath //html/body is not stable in the application");
			reportStep("The element with xpath //html/body is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The tab key has not been pressed due to unknown error");
			reportStep("The Arrow down key has not been pressed due to unknown error", "fail");
		} 
		
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not present in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not present in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable in the application due to unknown reason");
			reportStep("The element with xpath "+xpathVal+" is not clickable in the application due to unknown reason", "fail");
		} // TODO Auto-generated method stub
		
	}



}
