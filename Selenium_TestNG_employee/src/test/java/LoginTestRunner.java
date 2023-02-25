import dev.failsafe.internal.util.Assert;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;

public class LoginTestRunner extends Setup {

    LoginPage loginPage;

    @Test(priority = 1)
    public void doLogin() {
        loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        String actual = "OrangeHRM";
        Assert.isTrue(title.contains(actual), title);
        loginPage.doLogincred();
        String dtitle = loginPage.dboard.getText();
        String dactual = "Dashboard";
        Assert.isTrue(dtitle.contains(dactual), dtitle);
        System.out.println("Passed\n");
    }
    @Test
    public void logout(){
        loginPage.logout();
        WebElement logout = loginPage.logout_button.get(3);
        logout.click();
        String url = driver.getCurrentUrl();
        String aurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Assert.isTrue(url.equals(aurl),url);
    }
}