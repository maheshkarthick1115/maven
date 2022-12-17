package com.property;

import java.io.IOException;

public class File_Reader_Manager {
	
	
	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager getinstancefrm() {
		File_Reader_Manager frm =new File_Reader_Manager();
		return frm;
	}
	
	
	
	public Adactin_Property_file getproperty() throws IOException {
		Adactin_Property_file pf=new Adactin_Property_file();
		return pf;
	}

}
