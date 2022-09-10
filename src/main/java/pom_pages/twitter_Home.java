package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class twitter_Home {
	@FindBy(xpath="//span[text()='Sign up with phone or email']")
	private WebElement sign;
	
	@FindBy(name="name")
	private WebElement nam;
	
	@FindBy(name="phone_number")
	private WebElement phone;
    
	@FindBy(id="SELECTOR_1")
	private WebElement dd1;
	
	public WebElement getDd1() {
		return dd1;
	}

	public WebElement getDd2() {
		return dd2;
	}

	public WebElement getDd3() {
		return dd3;
	}
	@FindBy(id="SELECTOR_2")
	private WebElement dd2;
	
	@FindBy(id="SELECTOR_3")
	private WebElement dd3;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextbtn;
	
	public twitter_Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void signup() {
		sign.click();
	}
	public void nametextbox(String nametx) {
		nam.sendKeys(nametx);
	}
	public void phoneno(String number) {
		phone.sendKeys(number);
	}
	public void nextbutton() {
		nextbtn.click();
	}
}
