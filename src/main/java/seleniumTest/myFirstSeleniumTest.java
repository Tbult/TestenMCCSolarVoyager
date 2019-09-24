/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author t.bult
 */
public class myFirstSeleniumTest {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:4200/");
        // table
//        driver.findElement(By.className("table"));
//        System.out.println("There is a table");
//        // chart 1
//        driver.findElement(By.id("chartHours"));
//        System.out.println("There is a chartHours");
//        // chart 2
//        driver.findElement(By.id("speedChart"));
//        System.out.println("There is a speedchart");
        // Browser sluiten
        driver.quit();
    }
}
