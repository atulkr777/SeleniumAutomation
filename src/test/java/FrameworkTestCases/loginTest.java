package FrameworkTestCases;

import PageFactoryClasses.LoginPage;
import constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
    private WebDriver driver;
    LoginPage loginpage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        loginpage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get(Constant.appURL);


    }

    @Test
    public void checkLogin(){
        loginpage.setUserName("standard_user");
        loginpage.setPassword("secret_sauce");
        loginpage.clickLoginButton();
    }

    @AfterClass
    public void afterClass()
    {
        driver.close();
    }

}
