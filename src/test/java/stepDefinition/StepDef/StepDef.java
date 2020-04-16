package stepDefinition.StepDef;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDef {

    @Given("^user is on NetBanking landingpage$")
    public void user_is_on_netbanking_landingpage(){
    	
    	System.out.println("I'm on landing page");
        
    }


    @When("^use login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void use_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        
    	System.out.println("Navigated to home page");
    	
    }

    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg3) throws Throwable {
        System.out.println(strArg3);
    }

}