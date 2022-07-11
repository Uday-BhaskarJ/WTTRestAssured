package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources/features/studentApiFeature.feature" },
        tags = { "@Smoke" },
        glue = {"src/test/java/com/steps/StudentApiTest.java"}
)

public class TestRunner {
}
