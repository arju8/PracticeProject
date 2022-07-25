package com.propertyfile;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFR() {
		
		FileReaderManager fr=new FileReaderManager();
		return fr;
		
	}
	
	public static ConfigurationReader getInstanceCr() throws IOException {
		ConfigurationReader cr= new ConfigurationReader();
		return cr;
	}

}
