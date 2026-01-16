package statement;

import io.cucumber.java.en.Given;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("🔥 STEP EXECUTED 🔥");
    }
}
