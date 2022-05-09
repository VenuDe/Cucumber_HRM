package TestNGRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"src\\test\\resources\\Login\\Login.feature"},
glue = "Definations",
dryRun = false)

public class Test_Runner extends AbstractTestNGCucumberTests  {

}