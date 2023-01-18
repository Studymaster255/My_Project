package TestLayer;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import BaseLayer.BaseClass;
import UtilsLayer.AlertMethod;
import UtilsLayer.HandleWindowMethod;

public class DemoAlert extends BaseClass  {
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseClass base=new BaseClass();
		base.intilization();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]")).click();
//		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]")).click();
//		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[6]")).click();
		Thread.sleep(3000);
		HandleWindowMethod hw=new HandleWindowMethod();
		System.out.println(driver.getTitle());
		hw.handleWindows();
		hw.switchTowindow(3);
		System.out.println(driver.getTitle());
		System.out.println("ok");
	}
}
