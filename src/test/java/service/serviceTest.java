package service;

import com.services.request_test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class serviceTest {
	
	
	public static String xml = "";
	public static request_test rest = new request_test();
	
	@Given("^Se ejecuta servicio de prueba$")
	public void se_ejecuta_servicio_de_prueba() throws Throwable {
		xml = rest.resApiService("GET", "", "https://reqres.in/api/users");
		System.out.println(xml);
	}

	@Then("^Se presenta response$")
	public void se_presenta_response() throws Throwable {
	   System.out.println("Response OK!");
	}
	
}
