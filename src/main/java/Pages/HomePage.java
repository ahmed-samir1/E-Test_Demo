package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase {

    @FindBy(className = "userlink")
    public WebElement UserMenu;
    @FindBy(className = "ico-register")
    WebElement RegisterLink;
    @FindBy(className = "ico-login")
    WebElement LoginButton;
    @FindBy(className = "ico-account")
    WebElement myAccountButton;
    @FindBy(linkText = "Contact us")
    WebElement contactUsPageLink;
    @FindBy(id = "customerCurrency")
    WebElement dropDownCurrencyMenu;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement computersMenu;
    @FindBy(linkText = "Notebooks")
    WebElement notebooksPageLink;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[3]/a")
    WebElement Apparel;
    @FindBy(linkText = "Shoes")
    WebElement Shoes;
    @FindBy(xpath = "//input[@id='attribute-option-15']")
    WebElement Red;

    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
        action = new Actions(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void openRegistrationPage() {
        clickButton(RegisterLink);
    }

    public void openLoginPage() {
        clickButton(LoginButton);
    }

    public void openMyAccountPage() {
        clickButton(UserMenu);
        clickButton(myAccountButton);
    }

    public void openContactUsPage() {
        scrollToBottom();
        clickButton(contactUsPageLink);
    }

    public void selectEuroFromDropDownCurrencyMenu() {
        select = new Select(dropDownCurrencyMenu);
        select.selectByVisibleText("Euro");
    }

    public void openNotebooksMenuPage() {
        action.moveToElement(computersMenu)
                .build()
                .perform();
        action.moveToElement(notebooksPageLink)
                .click()
                .build()
                .perform();
    }

    public void openshoes() throws InterruptedException {
        action.moveToElement(Apparel)
                .build()
                .perform();
        action.moveToElement(Shoes)
                .click()
                .build()
                .perform();
        Thread.sleep(2000);
        Red.click();
    }

}
