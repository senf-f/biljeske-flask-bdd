package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePO {

    @FindBy(id="category")
    WebElement category_input;

    @FindBy(id="note")
    WebElement note_input;

}
