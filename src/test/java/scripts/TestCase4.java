package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Libaray.Baseclass;
import pom_pages.twitter_Home;

public class TestCase4 extends Baseclass {
	@Test
	public void tc4() throws InterruptedException, IOException {
		twitter_Home h=new twitter_Home(driver);
		h.signup();
		Thread.sleep(2000);
		h.nametextbox(pdata.getPF("name"));
		h.phoneno(pdata.getPF("mobileno"));
		DU.dropdown(h.getDd1(),pdata.getPF("monthdd"));
		DU.dropdown(h.getDd2(),pdata.getPF("daydd"));
		DU.dropdown(h.getDd3(),pdata.getPF("yeardd"));
		Thread.sleep(2000);
		h.nextbutton();
	}

}
