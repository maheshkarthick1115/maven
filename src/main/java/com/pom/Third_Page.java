package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Page {
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(id="continue")
	private WebElement continue2;

	public Third_Page(WebDriver driver2) {
       this.driver=driver2;
       PageFactory.initElements(driver,this);
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinue2() {
		return continue2;
	}

}
