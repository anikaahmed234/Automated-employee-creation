import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Elements {
    @FindBy(name = "username" )
    WebElement txtuname;
    @FindBy(name="password")
    WebElement txtpwd;
    @FindBy(css = "[type=submit]")
    WebElement btnlogin;

    @FindBy(css= ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement dboard;

    @FindBy(css =".oxd-text.oxd-text--span.oxd-main-menu-item--name")
    List<WebElement> menu;

    @FindBy(css=".oxd-button.oxd-button--medium.oxd-button--secondary")
    List<WebElement> addbutton;

    @FindBy(name="firstName")
    WebElement firstName;

    @FindBy(name="middleName")
    WebElement middleName;

    @FindBy(name="lastName")
    WebElement lastName;

    @FindBy(css=".oxd-switch-input.oxd-switch-input--active.--label-right")
    WebElement tooglebutton;

    @FindBy(css= ".oxd-input oxd-input--active.oxd-input--error")
    WebElement uname;

    @FindBy(css = "[type=password]")
    WebElement pwd;

    @FindBy(css=".oxd-input.oxd-input--active")
    WebElement confirmpwd;

    @FindBy( css = "[type=submit]")
    WebElement submit;

    @FindBy(css=".oxd-text.oxd-text--h6.orangehrm-main-title")
    WebElement personaldetails;

    @FindBy(css= ".oxd-topbar-body-nav-tab-item")
    List<WebElement> navbar;

    @FindBy(css= "oxd-text.oxd-text--h5.oxd-table-filter-title")
    WebElement empinfo;

    @FindBy(css= "oxd-input.oxd-input--active")
    WebElement empid;

    @FindBy( css = ".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    WebElement search;

    @FindBy(css = ".oxd-icon.bi-pencil-fill")
    List<WebElement> editicon;

    @FindBy(css = ".oxd-select-text--after")
    WebElement nationality;

    @FindBy(css = ".oxd-icon.bi-calendar.oxd-date-input-icon")
    WebElement dob;

    @FindBy(css = ".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    WebElement saveUpdatedData;

    @FindBy(css = ".oxd-select-text-input")
    List<WebElement> checknationality;

    @FindBy(css = ".oxd-input.oxd-input--active")
    List<WebElement> checkdob;

    @FindBy(css = ".oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon")
    WebElement dropdown_icon;

    @FindBy(css ="a.oxd-userdropdown-link")
    List<WebElement> logout_button;
    public Elements (WebDriver driver){
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
    // Assuming you have instantiated a WebDriver instance called "driver"
    public void scroll() {
        JavascriptExecutor jsExecutor = driver.JavascriptExecutor;
        jsExecutor.executeScript("window.scrollTo(300, document.body.scrollHeight)");
    }
    public  void logout(){
        dropdown_icon.click();
}
}
