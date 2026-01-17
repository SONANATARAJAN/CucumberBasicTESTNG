package statement;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

public class LoginSteps {

    @Given("user opens browser")
    public void open_browser() {
        Hooks.driver.get("https://automationintesting.com/selenium/testpage/");
    }

    @When("user enters credentials")
    public void enter_credentials() {
        System.out.println("Entering credentials");
        Hooks.driver.findElement(By.id("firstname")).sendKeys("sona");
        Hooks.driver.findElement(By.id("surname")).sendKeys("Sona N");


    }

    @Then("login should be successful")
    public void login_success() {
        System.out.println("Login success");
    }
}
