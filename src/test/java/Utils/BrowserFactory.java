package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String appURL) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("We do not support this browser");
        }
        driver.manage().window().maximize();
        driver.get(appURL);
        return driver;
    }
}
