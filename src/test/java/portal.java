import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by v.sabadash on 3/25/2015.
 */
public class portal {
    private static FirefoxDriver driver;

    @Test
    public void SrartWebDriver () {
        driver = new FirefoxDriver();
        //Log in to editorial
        driver.navigate().to("http://lion:8480/login/loginDashboard.jsp");
        WebElement usernamee = driver.findElement(By.id("j_username"));
        usernamee.sendKeys("admin");
        WebElement passworde = driver.findElement(By.id("j_password"));
        passworde.sendKeys("admin");
        usernamee.submit();


        //Log in to staging
        driver.navigate().to("http://lion:8580/login/loginDashboard.jsp");
        WebElement usernames = driver.findElement(By.id("j_username"));
        usernames.sendKeys("admin");
        WebElement passwords = driver.findElement(By.id("j_password"));
        passwords.sendKeys("admin");
        usernames.submit();

        //Log in to staging
        driver.navigate().to("http://lion:8680/login/loginDashboard.jsp");
        WebElement usernamel = driver.findElement(By.id("j_username"));
        usernamel.sendKeys("admin");
        WebElement passwordl = driver.findElement(By.id("j_password"));
        passwordl.sendKeys("admin");
        usernamel.submit();
    }
}
