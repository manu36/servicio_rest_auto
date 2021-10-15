package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.util.ConfigPage;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/serviceTest.feature"}, 
		glue = {""},
		plugin  = {"pretty",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html",
				"json:target/report.json"
				//"junit:target/xml/Cucumber.xml"
		},
		monochrome = true,
		tags = {"@tag"})

public class RunnerTest {	
	
	@AfterClass
	public static void main(String[] args) {
		Reporter.loadXMLConfig(ConfigPage.getReportConfigPath());
		Reporter.setSystemInfo("Tester QA", "Manuel Martinez");
		Reporter.setSystemInfo("Nombre Aplicacion", "Chrome");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Ambiente", "QA");	

	}

}
