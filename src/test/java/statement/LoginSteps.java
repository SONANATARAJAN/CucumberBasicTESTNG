package statement;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

public class LoginSteps {

    @Given("user opens browser")
    public void open_browser() {
        Hooks.driver.get("https://example.com");
    }

    @When("user enters credentials")
    public void enter_credentials() {
        System.out.println("Entering credentials");
    }

    @Then("login should be successful")
    public void login_success() {
        System.out.println("Login success");
    }
}
