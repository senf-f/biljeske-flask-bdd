package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePagePO {

    @FindBy(id = "category")
    public WebElement categoryUpdate_input;

    @FindBy(id = "note")
    public WebElement noteUpdate_input;

    @FindBy(css = "input[type='submit']")
    public WebElement submitUpdate_button;

    public UpdatePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clearAndEnterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
}
