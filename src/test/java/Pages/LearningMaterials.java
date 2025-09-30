package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LearningMaterials {

    WebDriver driver;

    @FindBy(id="tab-btn-web")
    WebElement APITestingTab_id;

    @FindBy(id="tab-btn-password")
    WebElement WebAutoAdvance_id;

    @FindBy(id="logout-button")
    WebElement LogoutButton_id;

    @FindBy(id="deviceType")
    WebElement deviceType_id;




    public LearningMaterials(WebDriver driver)
    {
        this.driver = driver;
    }

    public void verifyAPITestingTab()
    {
        new WebDriverWait(driver, Duration.ofSeconds(50)).until(visibilityOf(APITestingTab_id));
        APITestingTab_id.isDisplayed();
    }

    public void clickLogoutButton()
    {
        LogoutButton_id.click();
    }

    public void clickWebAutoAdvance()
    {
        WebAutoAdvance_id.click();
    }

    public void selectDeviceType(String deviceName)
    {
        Select dropdown = new Select(deviceType_id);
        dropdown.selectByVisibleText(deviceName);
    }
}
