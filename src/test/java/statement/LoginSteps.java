package statement;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import utils.BasePage;

public class LoginSteps {

    @Given("user opens browser")
    public void open_browser() {
        Hooks.driver.get("https://automationintesting.com/selenium/testpage/");
    }

    @When("user enters credentials {string} and {string}")
    public void enter_credentials(String firstname ,String surname) {
        System.out.println("Entering credentials: " + firstname + " " + surname);

        System.out.println("Entering credentials");
        Hooks.driver.findElement(By.id("firstname")).sendKeys(firstname);
        Hooks.driver.findElement(By.id("surname")).sendKeys(surname);
        By xpathDropdown = By.id("gender");
        BasePage.SelectedClass(xpathDropdown,"female");
        Hooks.driver.findElement(By.id("red")).click();

    }

    @Then("^login should be successful$")
    public void login_success() {
        System.out.println("Login success");
    }

}
