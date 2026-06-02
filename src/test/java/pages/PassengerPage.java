package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengerPage extends BasePage {

    @FindBy(id = "inputName")
    private WebElement nameInput;

    @FindBy(id = "address")
    private WebElement addressInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "creditCardNumber")
    private WebElement cardNumberInput;

    @FindBy(id = "creditCardMonth")
    private WebElement cardMonthInput;

    @FindBy(id = "creditCardYear")
    private WebElement cardYearInput;

    @FindBy(id = "nameOnCard")
    private WebElement nameOnCardInput;

    @FindBy(xpath = "//input[@value='Purchase Flight']")
    private WebElement purchaseButton;

    public void fillPassengerInfo(String name, String address, String city) {
        nameInput.sendKeys(name);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
    }

    public void fillCardInfo(String cardNumber, String month, String year, String cardName) {
        cardNumberInput.sendKeys(cardNumber);
        cardMonthInput.clear();
        cardMonthInput.sendKeys(month);
        cardYearInput.clear();
        cardYearInput.sendKeys(year);
        nameOnCardInput.sendKeys(cardName);
    }

    public void clickPurchase() {
        purchaseButton.click();
    }
}