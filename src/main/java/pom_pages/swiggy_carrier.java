package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swiggy_carrier {
	@FindBy(xpath="//input[@type='text']")
	private WebElement role;
	
	@FindBy(id="ilceler")
	private WebElement category;
	
	public WebElement getCategory() {
		return category;
	}

	@FindBy(xpath="//div[3]//div[1]//select[1]")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath="//button[text()='Search']")
	private WebElement search;
	
	public swiggy_carrier(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void rolefield(String name) {
		role.sendKeys(name);
	}
	
	public void searchbtn() {
		search.click();
	}

}
