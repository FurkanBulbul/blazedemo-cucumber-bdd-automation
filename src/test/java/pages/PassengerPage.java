package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerPage {
    WebDriver driver;


    private By nameInput = By.id("inputName");
    private By addressInput = By.id("address");
    private By cityInput = By.id("city");
    private By cardNumberInput = By.id("creditCardNumber");
    private By cardMonthInput = By.id("creditCardMonth");
    private By cardYearInput = By.id("creditCardYear");
    private By nameOnCardInput = By.id("nameOnCard");
    private By purchaseButton = By.xpath("//input[@value='Purchase Flight']");

    public PassengerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillPassengerInfo(String name, String address, String city) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(addressInput).sendKeys(address);
        driver.findElement(cityInput).sendKeys(city);
    }

    public void fillCardInfo(String cardNumber, String month, String year, String cardName) {
        driver.findElement(cardNumberInput).sendKeys(cardNumber);
        driver.findElement(cardMonthInput).clear();
        driver.findElement(cardMonthInput).sendKeys(month);
        driver.findElement(cardYearInput).clear();
        driver.findElement(cardYearInput).sendKeys(year);
        driver.findElement(nameOnCardInput).sendKeys(cardName);
    }

    public void clickPurchase() {
        driver.findElement(purchaseButton).click();
    }
}