package com.propertyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties p;
	public ConfigurationReader() throws IOException { //io expection is parent of filenotfound exception
		File f=new File("C:\\Users\\welcome\\git\\GreensProject\\MavenProject\\configuration\\config.properties");
		FileInputStream fis= new FileInputStream(f);
		p= new Properties();
		p.load(fis);

	}
	public String getUrl() {
		String String = p.getProperty("url");
		return String;

	}
}
