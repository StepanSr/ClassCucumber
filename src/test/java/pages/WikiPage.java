package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class WikiPage {
    WebDriver driver;

    public WikiPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "searchInput")
    public static WebElement searchBox;

    @FindBy(id = "firstHeading")
    public static WebElement header;
}

