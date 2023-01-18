package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static WebDriver driver;
	protected static Properties prop ;//= new Properties();

	public BaseClass() {
		prop = new Properties();
		String path = System.getProperty("user.dir") + 
				"\\src\\main\\java\\ConfigLayer\\config.properties";
		try {

			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void intilization() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

//	protected static Properties prop;
//	protected static WebDriver driver;
//	public BaseClass()
//	{
//		prop=new Properties();
//		String path=System.getProperty("user.dir")+ "//src/main/java/ConfigurationLayer/config.properties";
//		//src/main/java/ConfigurationLayer/config.properties
//		try {
//			FileInputStream fis=new FileInputStream(path);
//			prop.load(fis);
//			}catch(Exception e) 
//			{
//			e.printStackTrace();
//			}
//	}
//	public static void initilization()
//	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get(prop.getProperty("url"));
//	}
}
