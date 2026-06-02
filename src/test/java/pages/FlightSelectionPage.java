package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSelectionPage extends BasePage {

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    private WebElement firstFlightButton;

    public void chooseFirstFlight() {
        firstFlightButton.click();
    }
}