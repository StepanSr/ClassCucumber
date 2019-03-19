package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public class Mira {

    @Given("go to")
    public void go_to() {
        Driver.getDriver().get("https://www.dyn-web.com/tutorials/forms/select/selected.php");
    }

    @Then("ckek if selected")
    public void ckek_if_selected() {
        WebElement g = Driver.getDriver().findElement(By.xpath("//option[text()= 'Scrolling Divs JavaScript']"));
        List<WebElement> gg = Driver.getDriver().findElements(By.xpath("//select//option"));
        System.out.println(gg.size());
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select")));
        WebElement option = select.getFirstSelectedOption();
        //select.d
        System.out.println(option.getText());

        //Assert.assertTrue(g.getText(),g.isSelected());

        //System.out.println(g.getText());
    }



}
