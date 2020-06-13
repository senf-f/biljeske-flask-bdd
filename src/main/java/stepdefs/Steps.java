package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver83\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);

    }

    @Given("user is on the homepage")
    public void userIsOnTheHomepage() {
        driver.get("http://biljeske-flask.herokuapp.com/");
        Assert.assertEquals("Bilježnica", driver.getTitle());
    }

    @When("user adds a note")
    public void userAddsANote() {
        System.out.println("User adds a note");
    }

    @Then("note is visible in the list")
    public void noteIsVisibleInTheList() {
        System.out.println("note is visible in the list");
    }

    @When("user edits a note")
    public void userEditsANote() {
        System.out.println("user edits a note");
    }

    @Then("updated note is visible in the list")
    public void updatedNoteIsVisibleInTheList() {
        System.out.println("updated note is visible in the list");
    }

    @When("user deletes a note")
    public void userDeletesANote() {
        System.out.println("user deletes a note");
    }

    @Then("note is not visible in the list")
    public void noteIsNotVisibleInTheList() {
        System.out.println("note is not visible in the list");
    }
}
