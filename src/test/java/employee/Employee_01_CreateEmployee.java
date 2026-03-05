package employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Employee_01_CreateEmployee {
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void TC_01(){

    }
    @Test
    public void TC_02(){

    }
    @Test
    public void TC_03(){

    }
    @Test
    public void TC_04(){

    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
