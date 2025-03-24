package pageObject_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UIComponentsPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class=\"controls__container\"]")
    WebElement profileLogos;

    @FindBy(xpath = "//img[@src=\"/static/media/stylemart.a373eaeda45a08b95f81.png\"]")
    WebElement logoImage;

    @FindBy(xpath = "//input[@placeholder=\"Search for products\"]")
    WebElement searchInputField;

    public UIComponentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean validateUIComponents() {
        return profileLogos.isDisplayed() && logoImage.isDisplayed() && searchInputField.isDisplayed();
    }
}

