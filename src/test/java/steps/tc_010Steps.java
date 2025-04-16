package steps;

import pages.tc_010Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import static org.junit.Assert.*;

public class tc_010Steps {

    tc_010Page documentPage = new tc_010Page();

    @Given("a user has selected a loaded document")
    public void aUserHasSelectedALoadedDocument() {
        documentPage.openDocumentDetails();
    }

    @When("the user edits the metadata or description of the document")
    public void theUserEditsTheMetadataOrDescriptionOfTheDocument() {
        documentPage.editDocumentDetails("New metadata", "Updated description");
    }

    @When("clicks on 'Save changes'")
    public void clicksOnSaveChanges() {
        documentPage.saveChanges();
    }

    @Then("the document is updated with the new details")
    public void theDocumentIsUpdatedWithTheNewDetails() {
        assertTrue(documentPage.isDocumentUpdated());
    }

    @Then("a confirmation message is displayed")
    public void aConfirmationMessageIsDisplayed() {
        assertTrue(documentPage.isConfirmationMessageDisplayed());
    }
}