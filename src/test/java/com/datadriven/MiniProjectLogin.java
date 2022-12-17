package com.datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Maven_Project.BaseClass;
import com.manager.PageObjectManager;
import com.pom.LoginPage;
import com.property.File_Reader_Manager;

public class MiniProjectLogin extends BaseClass {

	public static WebDriver driver = launchingBrowser();

	public static void main(String[] args) throws IOException {
		
		String geturl = File_Reader_Manager.getinstancefrm().getproperty().geturl();
		launch_url(geturl);
		
		PageObjectManager pom = new PageObjectManager(driver);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
		String getusername = File_Reader_Manager.getinstancefrm().getproperty().getusername();
		passvalue(pom.getinstancelogin().getUsername(),getusername );

		String getpassword = File_Reader_Manager.getinstancefrm().getproperty().getpassword();
		passvalue(pom.getinstancelogin().getPassword(),getpassword);

		click_on_webelement(pom.getinstancelogin().getLogin());

		select_by_index(pom.getsecondpage().getLocation(), 2);

		select_by_index(pom.getsecondpage().getHotels(), 3);

		select_by_index(pom.getsecondpage().getRoom_type(), 2);

		select_by_index(pom.getsecondpage().getRoom_nos(), 1);

		select_by_value(pom.getsecondpage().getAdult_room(), "3");

		select_by_value(pom.getsecondpage().getChild_room(), "2");

		click_on_webelement(pom.getsecondpage().getSubmit());

		click_on_webelement(pom.getthirdpage().getRadiobutton_0());

		click_on_webelement(pom.getthirdpage().getContinue2());
		 
		String firstname = File_Reader_Manager.getinstancefrm().getproperty().firstname();
		passvalue(pom.getfourthpage().getFirst_name(),firstname);
		
		String lastname = File_Reader_Manager.getinstancefrm().getproperty().lastname();
		passvalue(pom.getfourthpage().getLast_name(),lastname);
		
		String address = File_Reader_Manager.getinstancefrm().getproperty().address();
		passvalue(pom.getfourthpage().getAddress(),address);
     
		String cc_num = File_Reader_Manager.getinstancefrm().getproperty().cc_num();
		passvalue(pom.getfourthpage().getCc_num(),cc_num);
		
		select_by_index(pom.getfourthpage().getCc_type(), 2);
		
		select_by_index(pom.getfourthpage().getCc_exp_month(), 9);
		
		select_by_index(pom.getfourthpage().getCc_exp_year(), 6);
		
		String cc_ccv = File_Reader_Manager.getinstancefrm().getproperty().cc_ccv();
        passvalue(pom.getfourthpage().getCc_cvv(), cc_ccv);
        
	}

}
