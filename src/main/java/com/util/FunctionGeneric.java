package com.util;

import java.io.IOException;

import com.vimalselvam.cucumber.listener.Reporter;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class FunctionGeneric {
	
	
	
	public String serviceRest(String token, String url) throws IOException {
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
				RequestBody body = RequestBody.create(mediaType, "");
				Request request = new Request.Builder()
				  .url(url)
				  .method("POST", body)
				  .addHeader("Authorization", "Bearer " + token)
				  .addHeader("Content-Type", "application/x-www-form-urlencoded")
				  .build();
				Response response = client.newCall(request).execute();
				
				imrpimirConsola("Message: " + response.message());
				// fileOpen.addLog("Message: " + response.message());
				imrpimirConsola("NetworkResponse: " + response.networkResponse());
				//fileOpen.addLog("NetworkResponse: " + response.networkResponse());
				imrpimirConsola("Request body: " + response.request());
				generarLogReporteStep("NetworkResponse: " + response.networkResponse().toString());
		
		return "";
	}
	
	
	
	public static void imrpimirConsola(String msg) {		
		System.out.println(msg);
	}
	
	public void generarLogReporteStep(String message) {		
		Reporter.addStepLog(message);
	}

}
