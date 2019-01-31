package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public  class DatatablePage {
    WebDriver driver;

    public DatatablePage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@class ='dt-button buttons-create']")
    public WebElement newBTN ;
    //*[@class = 'DTE_Body']
    @FindBy(xpath = " //*[@class = 'DTE_Body']")
    public WebElement tbl ;


    @FindBy(xpath = "//input[@id = 'DTE_Field_first_name']")
    public WebElement firstName ;
    @FindBy(xpath = "//input[@id = 'DTE_Field_last_name']")
    public WebElement lastName ;
    @FindBy(xpath = "//input[@id = 'DTE_Field_position']")
    public WebElement position ;
    @FindBy(xpath = "//input[@id = 'DTE_Field_office']")
    public WebElement office ;
    @FindBy(xpath = "//input[@id = 'DTE_Field_extn']")
    public WebElement extention ;
    @FindBy(xpath = "//input[@id = 'DTE_Field_start_date']")
    public WebElement startDate ;
    @FindBy(xpath = "//input[@id = 'DTE_Field_salary']")
    public WebElement salary ;

    @FindBy(xpath = "//button[@class = 'btn']")
    public WebElement createBTN ;


    @FindBy(xpath = "//input[@type = 'search']")
    public WebElement searchfild ;

    @FindBy(xpath= "//td[@class='sorting_1']")
    public WebElement firstResult;



}
