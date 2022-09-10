package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swiggy_opportunity {
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement opp;
	
	public swiggy_opportunity(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void oppertunity() {
		opp.click();
	}
	

}
