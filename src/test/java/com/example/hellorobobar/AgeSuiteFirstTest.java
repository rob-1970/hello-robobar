package com.example.hellorobobar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AgeSuiteFirstTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeAll
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void underageCola() {
        // Test name: UnderageCola
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("http://localhost:3000/");
        // 2 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 3 | assertText | css=tr:nth-child(4) > .ng-binding | €1.25
        // 1x RobaCola = €1.25
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€1.25"));
        // 4 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 5 | assertText | css=tr:nth-child(4) > .ng-binding | €2.50
        // 2x RobaCola = €2.50
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€2.50"));
        // 6 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 7 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 8 | assertText | css=p | Coming right up! ~bzzzt~
        assertThat(driver.findElement(By.cssSelector("p")).getText(), is("Coming right up! ~bzzzt~"));
    }

    @Test
    public void underageBeer() {
        // Test name: UnderageBeer
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("http://localhost:3000/");
        // 2 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 3 | assertText | css=tr:nth-child(4) > .ng-binding | €2.00
        // 1x RoboBeer = €2.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€2.00"));
        // 4 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 5 | assertText | css=tr:nth-child(4) > .ng-binding | €4.00
        // 2x RoboBeer = €4.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€4.00"));
        // 6 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 7 | mouseOver | css=.btn-success |
        {
            WebElement element = driver.findElement(By.cssSelector(".btn-success"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 8 | click | id=ageInput |
        driver.findElement(By.id("ageInput")).click();
        // 9 | type | id=ageInput | 17
        driver.findElement(By.id("ageInput")).sendKeys("17");
        // 10 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 11 | assertElementPresent | css=.alert-danger |
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
            assert (elements.size() > 0);
        }
    }

    @Test
    public void adultBeer() {
        // Test name: AdultBeer
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("http://localhost:3000/");
        // 2 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 3 | assertText | css=tr:nth-child(4) > .ng-binding | €2.00
        // 1x RoboBeer = €2.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€2.00"));
        // 4 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 5 | assertText | css=tr:nth-child(4) > .ng-binding | €4.00
        // 2x RoboBeer = €4.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€4.00"));
        // 6 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 7 | mouseOver | css=.btn-success |
        {
            WebElement element = driver.findElement(By.cssSelector(".btn-success"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        // 8 | click | id=ageInput |
        driver.findElement(By.id("ageInput")).click();
        // 9 | type | id=ageInput | 19
        driver.findElement(By.id("ageInput")).sendKeys("19");
        // 10 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 11 | assertText | css=p | Coming right up! ~bzzzt~
        assertThat(driver.findElement(By.cssSelector("p")).getText(), is("Coming right up! ~bzzzt~"));
    }
}
