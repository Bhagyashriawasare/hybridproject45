package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swiggy_login {
	@FindBy(xpath="//a[text()='Login']")
	private WebElement log;
	
	@FindBy(name="mobile")
	private WebElement mob;
	
	@FindBy(xpath="//a[@class='a-ayg'")
	private WebElement logbtn;
	
	public swiggy_login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void login() {
		log.click();
	}
	public void mobiletxt(String name) {
		mob.sendKeys(name);
	}
	public void loginbutton() {
		logbtn.click();
	}

}
