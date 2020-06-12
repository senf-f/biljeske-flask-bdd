package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class Steps {
    @Given("user is on the homepage")
    public void userIsOnTheHomepage() {
        System.out.println("User is on the homepage!");
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
