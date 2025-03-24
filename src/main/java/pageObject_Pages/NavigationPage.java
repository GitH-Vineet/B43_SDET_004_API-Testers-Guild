package pageObject_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='Home']")
    WebElement homeLink;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopLink;

    @FindBy(xpath = "//a[text()='Men']")
    WebElement menLink;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean verifyNavigationLinks() {
        return homeLink.isDisplayed() && shopLink.isDisplayed() && menLink.isDisplayed();
    }

    public void navigateTo(String page) {
        if (page.equalsIgnoreCase("home")) homeLink.click();
        if (page.equalsIgnoreCase("products")) shopLink.click();
        if (page.equalsIgnoreCase("contact")) menLink.click();
    }
}
