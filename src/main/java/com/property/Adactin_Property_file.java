package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import okhttp3.Address;

public class Adactin_Property_file {

	public static Properties p;

	public Adactin_Property_file() throws IOException {

		File f = new File(
				"C:\\Users\\TACTV\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\property\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String geturl() throws IOException {

		String url = p.getProperty("url");

		return url;
	}

	public String getusername() throws IOException {

		String username = p.getProperty("username");

		return username;
	}

	public String getpassword() throws IOException {

		String password = p.getProperty("password");

		return password;
	}

	public String firstname() {
		String firstname = p.getProperty("firstname");
		return firstname;

	}

	public String lastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}

	public String address() {
		String address = p.getProperty("address");
		return address;
	}

	public String cc_num() {
		String cc_num = p.getProperty("cc_num");
		return cc_num;
	}

	public String cc_ccv() {
		String cc_ccv = p.getProperty("cc_ccv");
		return cc_ccv;
	}

}
