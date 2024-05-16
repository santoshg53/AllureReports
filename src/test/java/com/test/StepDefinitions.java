package com.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;

public class StepDefinitions {
    WebDriver driver;

    @Given("I open the browser")
    public void i_open_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
    }
    @Then("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }

}