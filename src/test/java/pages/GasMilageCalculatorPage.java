package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMilageCalculatorPage {
    public GasMilageCalculatorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "uscodreading")
    public WebElement currentOdometerInput;

    @FindBy(id = "uspodreading")
    public WebElement previoustOdometerInput;

    @FindBy(id = "usgasputin")
    public WebElement gasInput;

    @FindBy(xpath = "//input[@alt = 'Calculate']")
    public WebElement calculateBtn;


    @FindBy (xpath = "//b[contains(text(), 'miles per gallon')]")
    public WebElement resultInGalon;




}
