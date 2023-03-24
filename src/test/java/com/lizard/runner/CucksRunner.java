package com.lizard.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"json:target/cucumber.json", //this one to connect with jira
                "html:target/cucumber-reports.html",
                 "rerun:target/rerun.txt"
        },
        glue = "com/lizard/stepDefenitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@logout"
)





public class CucksRunner {
}
