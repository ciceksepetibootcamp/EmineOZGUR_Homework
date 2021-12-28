package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/migros_productdetail.feature", glue= {"StepDefinitions/stepDefinition_ProductDetail.java"})
public class testRunner_productdetail 
{

}
