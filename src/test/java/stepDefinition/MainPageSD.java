package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.MainPage;

public class MainPageSD {


    private final MainPage mainPage=new MainPage();

   @Given("^I am on main page$")
public void IamOnMainPage(){
       Assert.assertEquals(mainPage.getMainPageElement(), "Feels Like: ");
   }


    @When("^I enter lowest temperature on main page$")
public void lowestTemp(){
        Assert.assertEquals(mainPage.getLowestTemp(), "Low: ");
    }

    @And("^I enter highest temperature on main page$")
public void highestTemp(){
        Assert.assertEquals(mainPage.getHighestTemp(), "High: ");
    }

    @Then("^I verify weather forecast$")

    public void forecast(){
        Assert.assertEquals(mainPage.getPageHeader(), "Wind:");
    }

}
