package com.example.hellorobobar.pageobject;

import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CartSuiteTest {
    // No page elements added

    /*public CartPageTest(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }*/

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    CartPage cartPage;

    @BeforeAll
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @BeforeEach
    public void setupTest() {
        cartPage = new CartPage(driver);
        driver.get("http://localhost:3000/");
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void colaTest() {
        cartPage.addColaButton.click();
        assertEquals(cartPage.totalField.getText(), "€1.25");
    }

}