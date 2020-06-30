package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    @FindBy(id="category")
    public WebElement category_input;

    @FindBy(id="note")
    public WebElement note_input;

    @FindBy(css = "input[type='submit']")
    public WebElement submit_button;

    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
