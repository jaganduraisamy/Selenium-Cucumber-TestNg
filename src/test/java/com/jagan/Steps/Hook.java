package com.jagan.Steps;


import com.jagan.base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {
	
	private BaseUtil base;
	
	public Hook(BaseUtil base){
		this.base = base;
	}
	
	@Before
	public void InitializeTest(){
		System.out.println(" ------ Before annotation. -------");
		WebDriverManager.chromedriver().setup();
		base.Driver = new ChromeDriver();
	}
	
	@After
	public void TearDownTest(Scenario scenario){
		base.Driver.quit();
	}
}
