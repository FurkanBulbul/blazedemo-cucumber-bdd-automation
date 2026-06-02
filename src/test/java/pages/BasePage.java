package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = Driver.getDriver();
        // Bu satır alt sınıflardaki tüm @FindBy anotasyonlarını otomatik aktif eder
        PageFactory.initElements(this.driver, this); 
    }
}