import dev.failsafe.internal.util.Assert;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class LoginTestRunner extends Setup {

    Elements elements;
    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    @BeforeTest(description = "Login")
    public void doLogin() {
        elements = new Elements(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String title = driver.getTitle();
        String actual = "OrangeHRM";
        Assert.isTrue(title.contains(actual), title);
        elements.doLogincred();
        String dtitle = elements.dboard.getText();
        String dactual = "Dashboard";
        Assert.isTrue(dtitle.contains(dactual), dtitle);
        System.out.println("Passed\n");
    }

    @Test
    public void createemp() throws InterruptedException {
        elements = new Elements(driver);
        elements.addbutton.get(0).click();
        Thread.sleep(5000);
        elements.firstName.sendKeys("Brinze");
        elements.lastName.sendKeys("Walf");
        elements.tooglebutton.click();
        elements.uname.sendKeys("Walf123");
        elements.pwd.sendKeys("Aa_23nika");
        elements.confirmpwd.sendKeys("Aa_23nika");
        elements.submit.click();
        String actual = elements.personaldetails.getText();
        String expected = "Personal Details";
        Assert.isTrue(actual.contains(expected), actual);
    }

    @Test
    public void searchemp() throws InterruptedException {
        elements = new Elements(driver);
        elements.navbar.get(1).click();
        String actual = elements.empinfo.getText();
        String expected = "Employee Information";
        Assert.isTrue(actual.contains(expected), actual);
        elements.empid.sendKeys();
        elements.search.click();
//         id assert
    }
    @Test
    public void updateemp() throws InterruptedException {
        elements = new Elements(driver);
       elements.editicon.get(0).click();
        scroll();
        elements.nationality.click();
        elements.dob.click();
        scroll();
        elements.saveUpdatedData.click();
    }

    @Test
    public void myinfo() throws InterruptedException {
        elements = new Elements(driver);
        elements.menu.get(5).click();
        scroll();
        String actual = elements.checknationality.get(0).getText();
        String expected = "Bangladeshi";
        Assert.isTrue(actual.contains(expected), actual);
        String pactual =  elements.checkdob.get(8).getText();
        String pexpected = "1998-04-23";
        Assert.isTrue(pactual.contains(pexpected), pactual);

    }
    @Test
    public void login_out() throws InterruptedException {
        elements = new Elements(driver);
        logout();
        doLogin();
    }
    @Test(description = "Log out")
    public void logout() {
        elements = new Elements(driver);
        elements.logout();
        WebElement logout = elements.logout_button.get(3);
        logout.click();
        String url = driver.getCurrentUrl();
        String aurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Assert.isTrue(url.equals(aurl), url);
    }
}