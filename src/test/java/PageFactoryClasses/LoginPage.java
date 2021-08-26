package PageFactoryClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;


    @FindBy(id = "user-name")
    WebElement TFuserName;

    @FindBy(id = "password")
    WebElement TFpassword;

    @FindBy(id = "login-button")
    WebElement BTNlogin;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String username) {
        TFuserName.sendKeys(username);
    }

    public void setPassword(String password) {
        TFpassword.sendKeys(password);
    }

    public void clickLoginButton() {
        BTNlogin.click();
    }

}
