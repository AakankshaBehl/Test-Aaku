package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propfile {


	static String path = System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	

	}

	public static void getProperties()

	{


		try {

			Properties prop = new Properties();

			InputStream input = new FileInputStream(path+"\\src\\test\\java\\config\\config.properties");

			prop.load(input);

			String browser = prop.getProperty("browser");

			System.out.println(browser);


		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}


	public static void setProperties()

	{

		Properties prop = new Properties();

		try {
			OutputStream output = new FileOutputStream(path+"\\src\\\\test\\\\java\\\\config\\\\config.properties");
			prop.setProperty("browser", "chrome");
			
			prop.store(output,null);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}


	}


}
