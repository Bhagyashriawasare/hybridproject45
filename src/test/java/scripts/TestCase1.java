package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Libaray.Baseclass;
import pom_pages.swiggy_carrier;
import pom_pages.swiggy_home;

public class TestCase1 extends Baseclass {
	
	@Test
	public void tc1() throws IOException {
		swiggy_home h=new swiggy_home(driver);
		DU.scrollbar(driver, 0, 7000);
		h.aboutus();
		
		swiggy_carrier c=new swiggy_carrier(driver);
		DU.switchtab(driver);
		c.rolefield("manager");
		DU.dropdown(c.getCategory(),pdata.getPF("cat"));
		DU.dropdown(c.getLocation(),pdata.getPF("loc"));
		c.searchbtn();
	}

}
