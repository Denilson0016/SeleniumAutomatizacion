package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;


public class GoogleSteps {

     GooglePage google = new GooglePage();
   

@Given("^I am on the Google search page$") 
public void navigateGoogle(){
    google.navigateToGoogle();
    
}
@When("^I enter a search criteria$") 
public void enterSearchCriteria(){
    google.enterSearchCriteria("Colombia");
}
@And("^Click on the search button$") 
public void clickSearchButton(){
    google.clickGoogleSearch();
}
@Then("^The results match the criteria$") 
public void validateResult(){

}
    
}
