package TestLayer;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilsLayer.JavaScriptMethods;

public class Testjava extends BaseClass {
	public static JavaScriptMethods jsm;
	public static void main(String[] args) throws IOException {
		BaseClass base=new BaseClass();
		BaseClass.intilization();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
	}
	
	
//	@Test
//	public void method_one() {
//		Assert.assertEquals("selenium", "selenium");
//	}
//
//	@Test(dependsOnMethods = {"method_one"})
//	public void method_two() {
//		Assert.assertEquals(12*12,14);
//	}
//	
//	@Test(dependsOnMethods = {"method_two"})
//	public void method_three() {
//		Assert.assertEquals("java","java");
	}

