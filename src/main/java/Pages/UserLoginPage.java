package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLoginPage extends PageBase {


    @FindBy(css = "body > div.master-wrapper-page > header > div > " +
            "div.header-links-wrapper > div.header-links > ul > li.inbox > a")
    public WebElement PrivateMessageButton;
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement Logpath;
    @FindBy(xpath = "//a[normalize-space()='Forgot password?']")
    WebElement forgetpassword;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement addemailaddress;

    @FindBy(id = "Username")
    WebElement usernameField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(css = "body > div.master-wrapper-page > section > div > div > div > div" +
            "> div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset " +
            "> form > div.form-fields > div.buttons > input")
    WebElement loginButton;

    @FindBy(className = "custom-control-label")
    WebElement RememberMeCheckbox;

    public UserLoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void loginpathin() {
        Logpath.click();
    }

    public void forgetpassword() {
        clickButton(forgetpassword);
    }

    public void addemailaddress(String email) {
        EnterText(addemailaddress, email);
    }

    public void userLogin(String username, String password) {
        EnterText(usernameField, username);
        EnterText(passwordField, password);
        clickButton(RememberMeCheckbox);

        clickButton(loginButton);
    }
}
