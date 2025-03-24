package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject_Pages.NavigationPage;
import pageObject_Pages.UIComponentsPage;

public class UIcomponentsSteps {
    WebDriver driver;

    UIComponentsPage uiComponentsPage;

    @Given("User is on the Homepage")
    public void userIsOnTheHomepage() {
        driver = new ChromeDriver();
        driver.get("https://luni-interface-029.vercel.app/");
        uiComponentsPage = new UIComponentsPage(driver);
    }

    @Then("UI components should be visible")
    public void uiComponentsShouldBeVisible() {
        Assert.assertTrue(uiComponentsPage.validateUIComponents());
        driver.quit();
    }
}
