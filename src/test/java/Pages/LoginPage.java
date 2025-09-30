package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage
{
    WebDriver driver;

    @FindBy(id="login-card")
    WebElement LoginTitle_id;

    @FindBy(id="login-email")
    WebElement Username_id;

    @FindBy(id="login-password")
    WebElement Password_id;

    @FindBy(id="login-submit")
    WebElement loginButton_id;

    public LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }

    public void verifyLoginPage()
    {
        new WebDriverWait(driver, Duration.ofSeconds(50)).until(visibilityOf(LoginTitle_id));
        LoginTitle_id.isDisplayed();
    }

    public void enterUsername(String email)
    {
        Username_id.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        Password_id.sendKeys(password);
    }

    public void clickLoginButton ()
    {
        loginButton_id.click();
    }

}
