package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Libaray.Baseclass;
import pom_pages.swiggy_login;

public class TestCase3 extends Baseclass {
	@Test
	public void tc3() throws IOException {
		swiggy_login l=new swiggy_login(driver);
		l.login();
		l.mobiletxt(pdata.getPF("mobile"));
		l.loginbutton();
	}

}
