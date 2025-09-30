package Tests;

import Pages.HomePage;
import Pages.LearningMaterials;
import Pages.LoginPage;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("Chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    LearningMaterials learningMaterials = PageFactory.initElements(driver, LearningMaterials.class);

    TakesScreenshots takesScreenshots = new TakesScreenshots();
}

