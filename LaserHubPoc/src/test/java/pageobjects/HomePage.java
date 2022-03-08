package pageobjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 
	 
	@FindBy(xpath="//*[@id=\"onetrust-accept-btn-handler\"]")

    WebElement Acceptcookies;
	
	@FindBy(xpath="//*[@id=\"password\"]")

    WebElement password;
	
	@FindBy(xpath="//*[@id=\"email\"]")

    WebElement Username;
	

	@FindBy(xpath="//*[@type=\"submit\"]")

    WebElement Submit;
	
	@FindBy(xpath="//*[text()='Create a new company account']")

    WebElement Radiobutton;
	
	@FindBy(xpath="//*[text()=\"Continue\"]")

    WebElement continuebutton;
	
	@FindBy(xpath="//*[@name=\"companyName\"]")

    WebElement companyName;
	
	@FindBy(xpath="//*[@name=\"role\"]")

    WebElement dropdown; 
	
	@FindBy(xpath="//*[text()='Select a company account']")
	 WebElement Selectcompany; 
	
	public void Verify_homePage()
	{
		password.isDisplayed();
		Username.isDisplayed();
		Submit.isDisplayed();
		
	}

	public void EnterUsername(String name) throws InterruptedException
	{
		
		Acceptcookies.click();
		driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.visibilityOf(Username));
		Username.sendKeys(name);
		
	}
	
	public void EnterPassword(String name)
	{
		password.sendKeys(name);
		
	}
	
	public void submit()
	{
		Submit.click();
		
	}
	
	public void ClickonRadioButton()
	{
		Radiobutton.click();
		
	}
	
	public void ClickoncontinueButton()
	{
		continuebutton.click();
		
	}
	
	public void Enter_companyName(String Name)
	{
		companyName.sendKeys(Name);
		
	}
	 
	public void Dropdown()
	{
		Select dd =new Select(dropdown);
		dd.selectByVisibleText("Purchasing manager");
	}
	
	public void Selectcompany()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Selectcompany.isDisplayed();
	}
	
	
}
