package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MyTests extends Base
{
    @Test
    public void verifyHomePageIsDisplayedTest(){
        homePage.verifyHomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Home Page");
    }
    @Test (dependsOnMethods = {"verifyHomePageIsDisplayedTest"})
    public void clickLearningMaterialTest(){
        homePage.clickLearningMaterial();
    }

    @Test (dependsOnMethods = {"clickLearningMaterialTest"})
    public void verifyLoginPageTest(){
        loginPage.verifyLoginPage();
    }

    @Test (dependsOnMethods = {"verifyLoginPageTest"})
    public void enterUsername(){
        loginPage.enterUsername("Nossy@gmail.com");
    }

    @Test (dependsOnMethods = {"enterUsername"})
    public void enterPassword(){
        loginPage.enterPassword("Nossy1234");

    }

    @Test (dependsOnMethods = {"enterPassword"})
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Test (dependsOnMethods = {"clickLoginButton"})
    public void verifyAPITestingTabIsDisplayedTest(){
        learningMaterials.verifyAPITestingTab();
    }

    @Test (dependsOnMethods = {"verifyAPITestingTabIsDisplayedTest"})
    public void clickWeAutomationAdvanceTab(){
        learningMaterials.clickWebAutoAdvance();
    }

    @Test (dependsOnMethods = {"clickWeAutomationAdvanceTab"})
    public void clickLogoutButton(){
        learningMaterials.clickLogoutButton();

    }
    @Test (dependsOnMethods = {"clickLogoutButton"})
    public void purchaseDevices(){
        learningMaterials.selectDeviceType("Phone");
    }

    @AfterTest
    public void closeBrowser(){ driver.quit();}
}



