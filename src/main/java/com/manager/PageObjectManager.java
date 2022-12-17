package com.manager;

import org.openqa.selenium.WebDriver;

import com.pom.Fourth_Page;
import com.pom.LoginPage;
import com.pom.SecondPage;
import com.pom.Third_Page;

public class PageObjectManager {
	public WebDriver driver;
	private LoginPage lp;
	private SecondPage sp;
	private Third_Page tp;
	private Fourth_Page fp;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public LoginPage getinstancelogin() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}

		return lp;
	}

	public SecondPage getsecondpage() {
		if (sp == null) {
			sp = new SecondPage(driver);

		}

		return sp;
	}

	public Third_Page getthirdpage() {
		if (tp == null) {
			tp = new Third_Page(driver);

		}
		return tp;

	}

	public Fourth_Page getfourthpage() {
		if (fp == null) {
			 fp = new Fourth_Page(driver);

		}
		return fp;
	}

}
