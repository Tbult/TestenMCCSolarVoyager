/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author t.bult
 */
public class Test_Steps {

    public static WebDriver driver;

    @Given("^User is on web page$")
    public void user_is_on_web_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:4200/");
       // throw new PendingException();
    }

    @When("^User sees a table and two graphs$")
    public void user_sees_a_table_and_two_graphs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
//        if (actualClass == expectedClass) {
//            System.out.println("The table is visible");
//        } else {
//            System.out.println("The table is NOT visible");
//        }
//          
        if (driver.findElement(By.className("table")).isDisplayed()){
            System.out.println("There is a table in test steps");
        }else{
            System.out.println("Nondeju");
        }
        
        // chart 1
        if (driver.findElement(By.id("chartHours")).isDisplayed()){
            System.out.println("There is a chart in test steps");
        }else{
            System.out.println("Nondeju");
        }
        if (driver.findElement(By.id("speedChart")).isDisplayed()){
            System.out.println("There is a speedchart in test steps");
        }else{
            System.out.println("Nondeju");
        }
        // Browser sluiten
      //  throw new PendingException();
    }

    @Then("^User close web page$")
    public void user_close_web_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
                // Browser sluiten
        driver.quit();
        //throw new PendingException();
    }
}
