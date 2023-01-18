package TestLayer;

import java.io.IOException;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import UtilsLayer.Frames;

public class TestConfig extends BaseClass {
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		BaseClass base=new BaseClass();
		base.intilization();
		Frames frame=new Frames();
		frame.frameByName("packageFrame");
		driver.findElement(By.xpath("//span[text()='Action']")).click();
		System.out.println("action");
	}

}
