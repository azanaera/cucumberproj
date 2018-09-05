package com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				 features={
						 "classpath:com/" 
//						 "classpath:cc/"
						 },
				 glue =   {
						 "classpath:com"
//						 "classpath:cc/" 
						 }
				 ,
				 plugin = {"pretty"}
		)
public class RunCucumberTest {
}