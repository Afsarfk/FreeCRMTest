package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//td[contains(text(),'user: md uddin')]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'contacts'])")
	WebElement contactslink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contacts'])")
	WebElement newContactslink;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Deals'])")
	WebElement dealslink;
	

	@FindBy(xpath = "//a[contains(text(),'Tasks'])")
	WebElement taskslink;
	
	
	//Initializing the Page Objects:
	public HomePage() {
	PageFactory.initElements(driver,this);
	
	}
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
		
	}
	public ContactsPage clickOnContactsLinks() {
		contactslink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickDealslink() {
		dealslink.click();
		return new DealsPage();
	}
	public TasksPage clickOnTaskllink() {
		taskslink.click();
		return new TasksPage();
		
	}
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactslink).build().perform();
		newContactslink.click();
		
		
	}
}
