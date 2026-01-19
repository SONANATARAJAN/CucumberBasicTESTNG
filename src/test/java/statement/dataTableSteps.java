package statement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;

import java.util.List;

public class dataTableSteps {

    @When("^Login Website and available form validation$")
    public void tEnterWebsite(){
    Hooks.driver.get("https://practice.expandtesting.com/form-validation");
    }
    @Then("enter to Form Validation")
    public void enterFormVali(){
        Hooks.driver.findElement(By.xpath("//a[@href='/form-validation'][normalize-space()='Try it out']")).click();
    }
    @And("entering required values")
    public void FillingForm(DataTable table){
        List<List<String>> list = table.asLists();
        System.out.println(list);
        Hooks.driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys(list.get(1).get(1));




    }

}
