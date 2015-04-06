import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by v.sabadash on 3/17/2015.
 */

public class myfirstTest {
    private static FirefoxDriver driver;

    @Test
    public void startWebDriver(){
        driver = new FirefoxDriver();


        driver.navigate().to("http://localhost:7777/portalserver/login/login.jsp");
        WebElement username = driver.findElement(By.id("j_username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("j_password"));
        password.sendKeys("admin");
        username.submit();
        driver.findElement(By.name("cxp-create-portal")).click();
        WebElement portal = driver.findElement(By.name("title"));
        portal.sendKeys("portal");
        portal.submit();
        driver.navigate().to("http://localhost:7777/portalserver/cxp-manager/pages//portal");
        driver.findElement(By.id("//html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/button[1]")).click();



    }


   @AfterClass
    public static void deletePortal(){
        driver.navigate().to("http://localhost:7777/portalserver/cxp-manager/portal-configuration//portal");
       driver.findElement(By.id("bd-removeButton")).click();
        //driver.quit();
    }
    }


