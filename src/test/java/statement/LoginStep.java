package statement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    @When("Login With Credential")
    public void login_with_credential() {
        System.out.println("Enter Login Page");
    }
    @And("Enter Username and Password")
    public void enter_username_and_password() {
        System.out.println("Enter Username and Password");
    }
    @Then("click enter")
    public void click_enter() {
        System.out.println("Submit and validated");
    }
}
