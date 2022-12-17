

package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue = "com.step_definition",plugin = {"html:Report/ss.html"})
public class Runner_Cucumber {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {

		driver = BaseClass.launchingBrowser();
	}
	@AfterClass
	public static  void teardown() {

		//driver.close();
	}
	

}
