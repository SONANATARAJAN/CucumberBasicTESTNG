package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import statement.Hooks;

public class BasePage {


    public static void SelectedClass(By Dropdown,String value){
        WebElement element = Hooks.driver.findElement(Dropdown);
        Select select=new Select(element);
        select.selectByValue(value);
    }
}
