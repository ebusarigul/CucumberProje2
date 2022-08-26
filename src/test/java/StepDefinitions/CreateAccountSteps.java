package StepDefinitions;

import Pages.Proje7POM;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static Utilities.GWD.driver;

public class CreateAccountSteps {

    Proje7POM p7 = new Proje7POM();

    @Given("Navigate to Magento")
    public void navigateToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click a Create an Account")
    public void clickACreateAnAccount(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            p7.findAndClick(listElement.get(i));
        }
    }

    @And("fill in the information")
    public void fillInTheInformation(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            p7.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }

    }

    @Then("Verify that your account has been opened")
    public void verifyThatYourAccountHasBeenOpened(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            p7.findAndContainsText(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @When("Click a Button")
    public void clickAButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            p7.findAndClick(listElement.get(i));
        }
    }

    @And("invisible loading")
    public void invisibleLoading() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt=\"Loading...\"]")));
    }

    @And("wait text to be welcome")
    public void waitTextToBeWelcome() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.xpath("(//li[@class=\"greet welcome\"]/span)[1]"),"Welcome, grup2 proje7!"));
    }

}
