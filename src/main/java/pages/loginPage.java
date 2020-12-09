package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
    WebDriver driver;
    WebDriverWait wait;

    public loginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);

    }

    @FindBy(xpath = "//input[@id='user_email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='user_password']") WebElement inputPassword;

    @FindBy(xpath = "//body/main[@id='site-content']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2" +
            "]/div[1]/form[1]/div[4]/input[1]") WebElement signInButton;

    @FindBy(xpath = "//div[contains(text(),'Perfomance')]") WebElement assertPerformance;

    public void loginEvent (String email, String Password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(Password);
        signInButton.click();
        wait.until(ExpectedConditions.urlContains("zolaelectric.com"));
    }

    public boolean performanceScreen() {
        return assertPerformance.isDisplayed();
    }
}

