package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swiggy_home {
	@FindBy(xpath="//a[text()='About us']")
	private WebElement about;
	
	public swiggy_home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void aboutus() {
		about.click();
	}

}
