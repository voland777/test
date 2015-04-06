import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by v.sabadash on 4/6/2015.
 */

public class CXP7489 {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void startWebDriver() {
        driver = new FirefoxDriver();
        baseUrl = "http://panther:8680/login/loginDashboard.jsp";
    }


    @Test
    public void createUser () {
        // Log in to CXP-manager
        driver.get(baseUrl);
        WebElement username = driver.findElement(By.id("j_username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("j_password"));
        password.sendKeys("admin");
        username.submit();
        WebElement myDynamicElement = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("bd-groups")));
        //Create User
        driver.findElement(By.className("bd-groups")).click();

    }
}
