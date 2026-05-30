package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import pages.FlightHomePage;
import pages.FlightSelectionPage;
import pages.PassengerPage;
import utils.Driver;

public class FlightSearchSteps {
    WebDriver driver = Driver.getDriver();
    FlightHomePage homePage = new FlightHomePage(driver);
    FlightSelectionPage selectionPage = new FlightSelectionPage(driver);
    PassengerPage passengerPage = new PassengerPage(driver);

    @Given("User is on the BlazeDemo home page")
    public void user_is_on_the_blaze_demo_home_page() {
        driver.get("https://blazedemo.com/");
    }

    @When("User selects departure city {string}")
    public void user_selects_departure_city(String departure) {
        homePage.selectDeparture(departure);
    }

    @And("User selects destination city {string}")
    public void user_selects_destination_city(String destination) {
        homePage.selectDestination(destination);
    }

    @And("User clicks on the {string} button")
    public void user_clicks_on_the_button(String buttonName) {
        homePage.clickFindFlights();
    }

    @Then("User should see available flights")
    public void user_should_see_available_flights() {

        org.openqa.selenium.support.ui.WebDriverWait wait = 
            new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.urlContains("reserve.php"));
        
        
        Assert.assertTrue(driver.getCurrentUrl().contains("reserve.php"));
    }

    @When("User chooses the first available flight")
    public void user_chooses_the_first_available_flight() {
        selectionPage.chooseFirstFlight();
    }

   @Then("User should be on the purchase page")
    public void user_should_be_on_the_purchase_page() {
        org.openqa.selenium.support.ui.WebDriverWait wait = 
            new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.urlContains("purchase.php"));

        Assert.assertTrue(driver.getCurrentUrl().contains("purchase.php"));
    }

    @When("User fills in passenger details {string} and {string} and {string}")
    public void user_fills_in_passenger_details(String name, String address, String city) {
        passengerPage.fillPassengerInfo(name, address, city);
    }

    @And("User enters credit card {string} and {string} and {string} and {string}")
    public void user_enters_credit_card(String cardNum, String month, String year, String name) {
        passengerPage.fillCardInfo(cardNum, month, year, name);
    }

    @And("User clicks Purchase Flight button")
    public void user_clicks_purchase_flight_button() {
        passengerPage.clickPurchase();
    }

    @Then("User should see the booking confirmation page")
    public void user_should_see_the_booking_confirmation_page() throws InterruptedException {

        org.openqa.selenium.support.ui.WebDriverWait wait = 
            new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(5));
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.urlContains("confirmation.php"));


        Assert.assertTrue(driver.getCurrentUrl().contains("confirmation.php"));
        

        Thread.sleep(3000); 
        Driver.closeDriver();
    }
}