/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumberTest2;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Feature"
,glue={""},
format = {"html:Report"}
)
/**
 *
 * @author t.bult
 */
public class TestRunner2 {    
}
