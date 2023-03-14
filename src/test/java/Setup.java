
//1. Visit the site:
//        https://opensource-demo.orangehrmlive.com/ (5)
//
//        2. Assert the dashboard (10)
//        3. Create 2 new employees (create login details showed on class) (20)
//        4. Search the employees with their Id and assert that 2 employees are found (20)
//        5. Then login with the last employee credential (20)
//        6. Update some employee info (e.g Nationality, Date of Birth) (10)
//        7. Now go to my info page and assert the edited info (10)
//        8. Finally logout your profile (5)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterTest
    public void Close(){
        driver.close();
    }
}