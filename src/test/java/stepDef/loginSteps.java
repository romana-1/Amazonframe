package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.sql.Driver;

import static base.config.driver;

public class loginSteps {
    @Given("user in Amazon Homepage")
    public void userInAmazonHomepage() {
    }
    @And("user click on Account & List")
    public void userClickOnAccountList() {
      driver.findElement(By.id("nav-link-accountList")).click();
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("tahim2009@yahoo.com");
        }

    @And("user click on continue button")
    public void userClickOnContinueButton() {
        driver.findElement(By.id("continue-announce")).click();
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        driver.findElement(By.name("password")).sendKeys("Tahim552009");
    }

    @When("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("the user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String businessAct = "Hello Romana";
        String developerCodeExp = driver.findElement(By.xpath("//*[@id='wrap']//h2")).getText();
        Assert.assertEquals(businessAct, developerCodeExp);
    }
    }




