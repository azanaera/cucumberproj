package com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features={
//						 "classpath:com/", 
						 "classpath:cc/"
						 },
				 glue =   {
//						 "classpath:com/", 
						 "classpath:cc/" 
						 }
				 ,

//				tags={"@Login","@Friyay"}
//				 ,
//				plugin={"json:src/test/resources/Report/Automated_Test_Execution_Report.json"}
				 plugin = {"pretty"}
		)
public class RunCucumberTest {
}