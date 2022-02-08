package com.example.hellorobobar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CartSuiteFirstTest {
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
    public void beerTest() {
        // Test name: BeerTest
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
    }

    @Test
    public void colaTest() {
        // Test name: ColaTest
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
    }

    @Test
    public void wineTest() {
        // Test name: WineTest
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("http://localhost:3000/");
        // 2 | click | css=.ng-scope:nth-child(3) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) > td .input-group-append > .btn")).click();
        // 3 | assertText | css=tr:nth-child(4) > .ng-binding | €3.00
        // 1x RobWine = €3.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€3.00"));
        // 4 | click | css=.ng-scope:nth-child(3) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) > td .input-group-append > .btn")).click();
        // 5 | assertText | css=tr:nth-child(4) > .ng-binding | €6.00
        // 2x RobWine = €6.00
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > .ng-binding")).getText(), is("€6.00"));
    }
}
