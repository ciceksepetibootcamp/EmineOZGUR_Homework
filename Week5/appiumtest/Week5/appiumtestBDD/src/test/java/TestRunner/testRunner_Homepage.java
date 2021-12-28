package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/migros_homepage.feature", glue= {"StepDefinitions/stepDefinition_Homapage.java"})
public class testRunner_Homepage {

}
