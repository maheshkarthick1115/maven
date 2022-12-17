package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Maven_Project.BaseClass;
import com.manager.PageObjectManager;

public class Testng_Program extends BaseClass {
public static WebDriver driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Test
	public void launch() {

		launchingBrowser();
		launch_url("https://adactinhotelapp.com/");
	}
	@Test
	public void login() {
		passvalue(pom.getinstancelogin().getUsername(), "karthick15");
		passvalue(pom.getinstancelogin().getPassword(), "emakarthick");
		click_on_webelement(pom.getinstancelogin().getLogin());

	}

	@Test
	public void searchHotels() {
		select_by_index(pom.getsecondpage().getLocation(), 2);
		select_by_index(pom.getsecondpage().getHotels(), 2);
		select_by_index(pom.getsecondpage().getRoom_type(), 2);
		select_by_index(pom.getsecondpage().getRoom_nos(), 3);
		select_by_index(pom.getsecondpage().getAdult_room(), 2);
		select_by_index(pom.getsecondpage().getChild_room(), 1);
		click_on_webelement(pom.getsecondpage().getSubmit());

	}

	@Test
	public void hotelCheck() {
		click_on_webelement(pom.getthirdpage().getRadiobutton_0());
		click_on_webelement(pom.getthirdpage().getContinue2());

	}

}
