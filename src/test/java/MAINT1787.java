import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by v.sabadash on 3/18/2015.
 */
public class MAINT1787 {
    private static FirefoxDriver driver;

    @Test
    public void startWebDriver() {

        driver = new FirefoxDriver();
        //Log in to CXP-manager
        driver.navigate().to("http://localhost:7777/portalserver/login/login.jsp");
        WebElement username = driver.findElement(By.id("j_username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("j_password"));
        password.sendKeys("admin");
        username.submit();
        //Create portal
        driver.findElement(By.name("cxp-create-portal")).click();
        WebElement portal = driver.findElement(By.name("title"));
        portal.sendKeys("portal");
        portal.submit();
        /*//Open portal
        driver.navigate().to("http://localhost:7777/portalserver/cxp-manager/pages//portal");*/
        //Create pages
        for (int abn =1; abn<800; abn++){
            driver.navigate().to("http://localhost:7777/portalserver/cxp-manager/pages//portal");
            driver.findElement(By.xpath(".//div[@class='bd-addPageButtons bc-float-right']//span[@class='bc-icn bc-plus']")).click();//(".bc-gradient-grey.bc-button.bc-action-button.bc-roundcorner-left-5")).click();
            WebElement label = driver.findElement(By.name("linkTitle"));
            label.sendKeys("page" + abn);
            driver.findElement(By.xpath("//*[@id='newPageForm']/div[3]/div/button[1]")).click();
            //driver.navigate().to("http://localhost:7777/portalserver/cxp-manager/pages//test");
        }
    }
}