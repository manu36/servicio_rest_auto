package com.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class getPropeties {
	
	private static Properties p = new Properties(); 
	
	  private getPropeties() {
		    throw new IllegalStateException("Utility class");
		  }
	
	public static String nombreFeature(String dato) {
		
		String name = "";
		if (dato.equals("autentificacion")) {			
			name = "ServicioAutenticacion";
		}		
		return name;
	}
	
	public static String getProp(String titulo) {
		
		try {
			p.load(new FileReader(System.getProperty("user.dir") + "/src/main/java/com/util/config.properties"));

		} catch (IOException e) {
			return e.getMessage();
		}
		return p.getProperty(titulo);
	}
	


}
