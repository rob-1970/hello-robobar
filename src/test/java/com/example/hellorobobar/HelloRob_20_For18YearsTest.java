package com.example.hellorobobar;
// Generated by Selenium IDE

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HelloRob_20_For18YearsTest {
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
    public void Test_1_1_1_for18years() {
        // Test name: TEST 1 + 1 + 1 for > 18 years
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("http://localhost:3000/");
        // 2 | setWindowSize | 1344x963 |
        driver.manage().window().setSize(new Dimension(1344, 963));
        // 3 | click | css=.ng-scope:nth-child(1) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(1) > td .input-group-append > .btn")).click();
        // 4 | click | css=.ng-scope:nth-child(2) > td .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(2) > td .input-group-append > .btn")).click();
        // 5 | click | css=.ng-scope:nth-child(3) .input-group-append > .btn |
        driver.findElement(By.cssSelector(".ng-scope:nth-child(3) .input-group-append > .btn")).click();
        // 6 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 7 | click | id=ageInput |
        driver.findElement(By.id("ageInput")).click();
        // 8 | type | id=ageInput | 18
        driver.findElement(By.id("ageInput")).sendKeys("18");
        // 9 | click | css=.btn-success |
        driver.findElement(By.cssSelector(".btn-success")).click();
        // 10 | assertText | css=.alert > .ng-binding | Only adults can buy alcohol!
        assertThat(driver.findElement(By.cssSelector(".alert > .ng-binding")).getText(), is("Only adults can buy alcohol!"));
    }
}