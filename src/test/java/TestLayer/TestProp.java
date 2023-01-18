package TestLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProp {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "//src/main/java/ConfigLayer/config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
	}

}
