package com.coder.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by miker on 2018/12/27 23:56.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"com.coder"}
)
public class runTest {
}
