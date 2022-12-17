package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Maven_Project.BaseClass;

public class Alert_Methods extends BaseClass {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\TACTV\\eclipse-workspace\\Selinium1\\driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
//		driver.manage().window().maximize();
		launchingBrowser();
		launch_url("http://testleaf.herokuapp.com/pages/Alert.html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		//alertbox.click();
		click_on_webelement(alertbox);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		alert("simple alert", "","");
		
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
//		confirm.click();
		click_on_webelement(confirm);
//		Alert alert2 = driver.switchTo().alert();
//		alert2.dismiss();
		alert("confirm alert", "ok","");
		
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		prompt.click();
		//click_on_webelement(prompt);
//		Alert alert3 = driver.switchTo().alert();
//		alert3.sendKeys("karthick");
//		alert3.accept();
		alert("prompt alert", "", "karthi");
	}

}
