package Libaray;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {
	public String getPF(String key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(autoconstant.propertyfile);
		p.load(fis);
		return p.getProperty(key);
		
	}

}
