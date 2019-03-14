package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BTNPage {
    WebDriver driver;

    public BTNPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> sportList;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> days;

    @FindBy(tagName = "label")
    public List<WebElement> daysLabel;

}
