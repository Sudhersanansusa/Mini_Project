package com.properties;

public class File_reader_manager {
	
	private File_reader_manager() {


	}
	
	public static File_reader_manager getInstanceFRM() {

		File_reader_manager FRM = new File_reader_manager();
		
		return FRM;

	}
	
	public  Configuration_reader getInstanceCR() throws Throwable {

		Configuration_reader CR = new Configuration_reader();
		
		return CR;

	}

}
