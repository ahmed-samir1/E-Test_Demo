package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends PageBase {

    @FindBy(css = "body > div.master-wrapper-page > section > div > " +
            "div > div > div.center-2 > div > div > div")
    public WebElement PasswordSuccessMessage;
    @FindBy(linkText = "Change password")
    WebElement changePasswordPageButton;

    @FindBy(id = "OldPassword")
    WebElement oldPasswordField;

    @FindBy(id = "NewPassword")
    WebElement newPasswordField;

    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPasswordField;

    @FindBy(css = "body > div.master-wrapper-page > section > div > div >" +
            " div > div.center-2 > div > div > form > div.buttons > input")
    WebElement changeOldPasswordButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void ChangePassword(String oldPassword, String newPassword) {
        clickButton(changePasswordPageButton);
        EnterText(oldPasswordField, oldPassword);
        EnterText(newPasswordField, newPassword);
        EnterText(confirmPasswordField, newPassword);
        clickButton(changeOldPasswordButton);
    }
}
