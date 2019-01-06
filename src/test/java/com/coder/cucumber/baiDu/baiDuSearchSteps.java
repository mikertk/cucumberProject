package com.coder.cucumber.baiDu;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by miker on 2018/12/27 23:31.
 */
public class baiDuSearchSteps {

    private WebDriver driver;

    @Given("^Go to baiDu home$")
    public void go_to_baiDu_home() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");
    }

    @When("^Type the search text \"([^\"]*)\"$")
    public void type_the_search_text(String searchText) {
        WebElement searchInput = driver.findElement(By.id("kw"));
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    @And("^Click the submit$")
    public void click_the_submit(){
        driver.findElement(By.id("su")).click();
    }

    @Then("^result include cucumber$")
    public void result_include_cucumber() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("cucumber_百度搜索", driver.getTitle());
        driver.quit();
    }


}
