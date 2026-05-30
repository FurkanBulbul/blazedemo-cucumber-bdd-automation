package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSelectionPage {
    WebDriver driver;


    private By firstFlightButton = By.xpath("(//input[@type='submit'])[1]");

    public FlightSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseFirstFlight() {
        driver.findElement(firstFlightButton).click();
    }
}