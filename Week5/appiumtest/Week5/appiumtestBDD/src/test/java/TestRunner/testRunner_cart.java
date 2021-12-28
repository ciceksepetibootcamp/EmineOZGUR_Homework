package TestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import Tests.cartTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/migros_cart.feature", glue= {"StepDefinitions/stepDefinition_Cart.java"})
public class testRunner_cart{

}
