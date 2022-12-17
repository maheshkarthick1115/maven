package com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchingBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void launch_url(String url) {
		driver.get(url);
	}

	public static void closebrowser() {
		driver.close();
	}

	public static void passvalue(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static void click_on_webelement(WebElement element) {
		element.click();
	}

	public static void select_by_index(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	public static void select_by_value(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);

	}

	public static void select_by_visibletext(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByVisibleText(name);

	}

	public static void screenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigate_to(String url) {
		driver.navigate().to(url);
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refre() {
		driver.navigate().refresh();
	}

	public static void alert(String alerttype, String confirmalertname,String name) {
		 
		if (alerttype.equalsIgnoreCase("simple alert")) {
			Alert simplealert = driver.switchTo().alert();
			simplealert.accept();
		}
		else if (alerttype.equalsIgnoreCase("comfirm alert")) {

			Alert comfirmalert = driver.switchTo().alert();
			if (confirmalertname.equalsIgnoreCase("ok")) {
				comfirmalert.accept();
			}else if (confirmalertname.equalsIgnoreCase("cancel")) {
				comfirmalert.dismiss();
				
			}

		}
		else if (alerttype.equalsIgnoreCase("prompt alert")) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(name);
			alert.accept();
			
			
		}

	}

}
