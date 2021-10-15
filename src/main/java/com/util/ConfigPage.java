package com.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigPage {
	
	private static Properties p = new Properties(); 
	
	
	public static String getProp(String titulo) {
		
		try {
			p.load(new FileReader(System.getProperty("user.dir") + "/src/main/java/com/util/config.properties"));

		} catch (IOException e) {
			return e.getMessage();
		}
		return p.getProperty(titulo);
	}
	
	public static String getReportConfigPath() {
		
		try {
			p.load(new FileReader(System.getProperty("user.dir") + "/config/extent-config.xml"));

		} catch (IOException e) {
			return e.getMessage();
		}
		return p.getProperty("No se encuentra archivo en la ruta seleccionada");
	}

}
