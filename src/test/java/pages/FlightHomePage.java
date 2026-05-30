package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightHomePage {
    WebDriver driver;


    private By departureDropdown = By.name("fromPort");
    private By destinationDropdown = By.name("toPort");
    private By findFlightsButton = By.xpath("//input[@value='Find Flights']");


    public FlightHomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void selectDeparture(String departure) {
        Select select = new Select(driver.findElement(departureDropdown));
        select.selectByVisibleText(departure);
    }

    public void selectDestination(String destination) {
        Select select = new Select(driver.findElement(destinationDropdown));
        select.selectByVisibleText(destination);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsButton).click();
    }
}