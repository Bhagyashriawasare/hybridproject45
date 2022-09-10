package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swiggy_link {
	@FindBy(xpath="(//i[@class='fab fa-linkedin-in'])[1]")
	private WebElement link;
	
	public swiggy_link(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void linkdelin() {
		link.click();
	}

}
