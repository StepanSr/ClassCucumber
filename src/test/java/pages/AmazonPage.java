package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    WebDriver driver;

    public AmazonPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@value = 'Go']")
    public WebElement searchBTN;

    @FindBy(css = "span.a-color-state.a-text-bold")
    public WebElement result;

    @FindBy(id = "bcKwText")
    public By hzhz;


//    public String a () {
//        String a = driver.findElement(By.id("bcKwText")).getText();
//        return a;


//    }

}