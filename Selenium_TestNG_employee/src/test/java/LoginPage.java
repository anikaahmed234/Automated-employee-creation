import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LoginPage {
    @FindBy(name = "username" )
    WebElement txtuname;
    @FindBy(name="password")
    WebElement txtpwd;
    @FindBy(css = "[type=submit]")
    WebElement btnlogin;

    @FindBy(css= ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement dboard;
    @FindBy(css = ".oxd-text.oxd-text--p.oxd-alert-content-text")
    WebElement alert;

    @FindBy(css = ".oxd-text.oxd-text--p.orangehrm-login-forgot-header")
    WebElement forgotpwd;

    @FindBy(css = ".oxd-text.oxd-text--h6.orangehrm-forgot-password-title")
    WebElement resetpwdtitle;

    @FindBy(css = ".oxd-input.oxd-input--active")
    WebElement forgotpwduname;

    @FindBy( css = ".oxd-button.oxd-button--large.oxd-button--ghost.orangehrm-forgot-password-button.orangehrm-forgot-password-button--cancel")
    WebElement forgotcancel;

    @FindBy( css = ".oxd-button.oxd-button--large.oxd-button--secondary.orangehrm-forgot-password-button.orangehrm-forgot-password-button--reset")
    WebElement forgotreset ;

    @FindBy(css= ".oxd-text.oxd-text--h6.orangehrm-forgot-password-title")
    WebElement resetlink;

    @FindBy(css= ".oxd-icon.orangehrm-sm-icon")
    List<WebElement> socialmed;

    @FindBy(css = ".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")
    WebElement dropdown_icon;

    @FindBy(css ="a.oxd-userdropdown-link")
    List<WebElement> logout_button;
    public LoginPage (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void doLogincred(){
        txtuname.sendKeys("admin");
        txtpwd.sendKeys("admin123");
        btnlogin.click();
    }
    public void doLoginwred(){
        txtuname.sendKeys("rust");
        txtpwd.sendKeys("ain123");
        btnlogin.click();
    }
    public void mforgetpwd(){
        forgotpwd.click();
    }
    public void reset(){
        forgotpwduname.sendKeys("admin");
    }
    public void forgetcancel(){
        forgotcancel.click();
    }
    public void setForgotreset(){
        forgotreset.click();
    }
    public void lin(){
        socialmed.get(0).click();
    }
    public void fb(){
        socialmed.get(1).click();
    }
    public void twitter(){
        socialmed.get(2).click();
    }
    public void yt(){
        socialmed.get(3).click();
    }
    public  void logout(){
        dropdown_icon.click();
}
}
