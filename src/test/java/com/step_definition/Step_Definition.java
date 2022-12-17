package com.step_definition;

import com.Maven_Project.BaseClass;
import com.manager.PageObjectManager;
import com.property.File_Reader_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Definition extends BaseClass {
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^user must launch the url$")
	public void user_must_launch_the_url() throws Throwable {

		String geturl = File_Reader_Manager.getinstancefrm().getproperty().geturl();
		launch_url(geturl);
		
	}

	@When("^enter the username in username field$")
	public void enter_the_username_in_username_field() throws Throwable {
		String getusername = File_Reader_Manager.getinstancefrm().getproperty().getusername();
		passvalue(pom.getinstancelogin().getUsername(),getusername );

	}

	@When("^enter the password in password field$")
	public void enter_the_password_in_password_field() throws Throwable {
		String getpassword = File_Reader_Manager.getinstancefrm().getproperty().getpassword();
		passvalue(pom.getinstancelogin().getPassword(),getpassword);

		
	}

	@Then("^click the login button and it navigate to the next page$")
	public void click_the_login_button_and_it_navigate_to_the_next_page() throws Throwable {
		click_on_webelement(pom.getinstancelogin().getLogin());
		
	}



}
