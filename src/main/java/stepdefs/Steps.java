package stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Steps {

    WebDriver driver;
    int noOfRows;
    int updatedNoOfRows;
    int randomTestId;
    String noteDate;
    String noteTime;

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
        noOfRows = driver.findElements(By.cssSelector("table tr")).size();
        randomTestId = (int) (Math.random() * 1000000);
        driver.findElement(By.id("category")).sendKeys("TEST kategorija "+randomTestId);
        driver.findElement(By.id("note")).sendKeys("TEST bilješka "+randomTestId);
        WebElement element = driver.findElement(By.cssSelector("input[type='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

        updatedNoOfRows = driver.findElements(By.cssSelector("table tr")).size();
        Assert.assertEquals(updatedNoOfRows, noOfRows + 1);
        System.out.println("Bilješka uspješno dodana!");
    }

    @Then("note is visible in the list")
    public void noteIsVisibleInTheList() {
        String lastRow = driver.findElement(By.cssSelector("table tr:last-child")).getText();
        System.out.println(Arrays.toString(lastRow.split(" ")));
        String dateOfNote = driver.findElement(By.cssSelector("table tr:last-child td:nth-child(3)")).getText().split(" ")[0].strip();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        Assert.assertEquals("Wrong date! Today's date was expected.", dateOfNote, dtf.format(now));
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
