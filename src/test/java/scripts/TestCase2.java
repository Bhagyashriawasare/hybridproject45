package scripts;

import org.testng.annotations.Test;

import Libaray.Baseclass;
import pom_pages.swiggy_home;
import pom_pages.swiggy_link;
import pom_pages.swiggy_opportunity;

public class TestCase2 extends Baseclass {
	@Test
	public void tc2() {
		swiggy_home h=new swiggy_home(driver);
		DU.scrollbar(driver, 0, 7000);
		h.aboutus();
		
		swiggy_opportunity o=new swiggy_opportunity(driver);
        DU.switchtab(driver);
		o.oppertunity();
		
		swiggy_link l=new swiggy_link(driver);
		DU.switchtab(driver);
		l.linkdelin();
	}

}
