package com.sword.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/myCucumberReport.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt",

                "json:target/cucumber-reports.json"
        },


        features = "src/test/resources/features",
        glue = "com/sword/step_definitions",
        dryRun = false,
        tags="@SCRUM-1252"
)

public class CukesRunner {

}
