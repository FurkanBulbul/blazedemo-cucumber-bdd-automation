package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightHomePage extends BasePage {
     

    @FindBy(name = "fromPort")
    private WebElement departureDropdown;

    @FindBy(name = "toPort")
    private WebElement destinationDropdown;

    @FindBy(xpath = "//input[@value='Find Flights']")
    private WebElement findFlightsButton;

    public void selectDeparture(String departure) {
        Select select = new Select(departureDropdown);  
        select.selectByVisibleText(departure);
    }

    public void selectDestination(String destination) {
        Select select = new Select(destinationDropdown);
        select.selectByVisibleText(destination);
    }

    public void clickFindFlights() {
        findFlightsButton.click();
    }
}