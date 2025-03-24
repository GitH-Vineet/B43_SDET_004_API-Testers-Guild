package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject_Pages.NavigationPage;

public class NavigationSteps {
    WebDriver driver;

    NavigationPage navigationPage;

    @Given("User is on the homepage")
    public void userIsOnTheHomepage() {
        driver = new ChromeDriver();
        driver.get("https://luni-interface-029.vercel.app/");
        navigationPage = new NavigationPage(driver);
    }

    @Then("User should see navigation links")
    public void userShouldSeeNavigationLinks() {
        Assert.assertTrue(navigationPage.verifyNavigationLinks());
        driver.quit();
    }

}
