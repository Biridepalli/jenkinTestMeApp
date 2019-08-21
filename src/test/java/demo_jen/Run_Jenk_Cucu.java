package demo_jen;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\Selenium_WS\\demoCucum1\\Feature101\\feat1.feature",
glue = "demo_jen",
plugin= {"json:target/cucumber.json"})

public class Run_Jenk_Cucu {

}
