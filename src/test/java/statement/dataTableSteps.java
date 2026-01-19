package statement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dataTableSteps {

    @When("^Login Website and available form validation$")
    public void tEnterWebsite(){
    Hooks.driver.get("https://practice.expandtesting.com/");
    Hooks.driver.manage().window().maximize();

    }
    @Then("enter to Form Validation")
    public void enterFormVali() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js =(JavascriptExecutor) Hooks.driver;
       WebElement element= Hooks.driver.findElement(By.xpath("//a[@href='/form-validation'][normalize-space()='Try it out']"));
       js.executeScript("arguments[0].scrollIntoView(true)",element);
       js.executeScript("arguments[0].click()",element);
        Thread.sleep(3000);

    }
    @And("entering required values")
    public void FillingForm(DataTable table){
        List<List<String>> list = table.asLists();
        System.out.println(list);
        Hooks.driver.findElement(By.xpath("//input[@id='validationCustom01']")).clear();
        Hooks.driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys(list.get(1).get(1));

        WebElement contactNum = Hooks.driver.findElement(By.xpath("(//input[@id='validationCustom05'])[1]"));
        contactNum.clear();
        contactNum.sendKeys(list.get(2).get(1));


        Hooks.driver.findElement(By.xpath("(//input[@id='validationCustom05'])[2]")).clear();






    }

}
