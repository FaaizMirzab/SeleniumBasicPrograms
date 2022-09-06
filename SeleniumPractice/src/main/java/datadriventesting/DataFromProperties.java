package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFromProperties {
	public static void main(String[] args) throws IOException {
		Properties p =new Properties();
		FileInputStream ip=new FileInputStream("./valuesForDataDriver.properties");
		p.load(ip);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("pass"));
	}
}
