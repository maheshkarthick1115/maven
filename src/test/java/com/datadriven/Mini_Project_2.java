package com.datadriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Project.BaseClass;

public class Mini_Project_2 extends BaseClass{
	
	public static WebDriver driver = launchingBrowser();
	public static void main(String[] args) throws InterruptedException, IOException {

		//launchingBrowser();
		launch_url("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		passvalue(username,"karthick15");
		
		WebElement pass = driver.findElement(By.id("password"));
		passvalue(pass,"emakarthick");
		
		WebElement login = driver.findElement(By.id("login"));
		click_on_webelement(login);
		
		
		WebElement locatoin = driver.findElement(By.id("location"));
		select_by_index(locatoin, 2);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		select_by_index(hotel, 3);
		
		WebElement room = driver.findElement(By.id("room_type"));
		select_by_index(room, 2);
		
		WebElement num = driver.findElement(By.id("room_nos"));
		select_by_index(num,1);
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		passvalue(checkin, "20");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		passvalue(checkout, "22");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		select_by_value(adult,"3");
		
		WebElement child = driver.findElement(By.id("child_room"));
		select_by_value(child, "2");
		
		WebElement search = driver.findElement(By.id("Submit"));
		click_on_webelement(search);
		
		WebElement click = driver.findElement(By.id("radiobutton_0"));
		click_on_webelement(click);
		
		WebElement cont = driver.findElement(By.id("continue"));
		click_on_webelement(cont);
		
		
		WebElement name = driver.findElement(By.id("first_name"));
		passvalue(name,"karthick");
		
		WebElement last = driver.findElement(By.id("last_name"));
		passvalue(last,"muthu kumaran");
		
		WebElement add= driver.findElement(By.id("address"));
		passvalue(add,"3,alapakkam main road,valasaravakkam,chennai-600087");
		
		WebElement cc = driver.findElement(By.id("cc_num"));
		passvalue(cc,"9904245282448544");
		
		WebElement type = driver.findElement(By.id("cc_type"));
		select_by_index(type, 2);
		
		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		select_by_index(exp, 9);
		
		WebElement expp = driver.findElement(By.id("cc_exp_year"));
		select_by_index(expp,6);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		passvalue(cvv,"232");
		
		screenshot("C:\\Users\\TACTV\\eclipse-workspace\\Maven_Project\\screenshot\\karthii.png");
		
	}

}
