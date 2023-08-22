package testBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class testBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public testBase() {
		String path = System.getProperty("user.dir")+ "//src//resource//newSite//config.properties";
		prop = new Properties();
		FileInputStream fin ;
		try {
		fin= new FileInputStream(path);
		prop.load(fin);
		
		

	
}
