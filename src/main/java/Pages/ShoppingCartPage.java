package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShoppingCartPage extends PageBase {
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement productName;
    @FindBy(xpath = "//div[@class='no-data']")
    public WebElement emptyCartSuccessMessage;
    @FindBy(tagName = "tr")
    WebElement productDetailsField;

    @FindBy(tagName = "td")
    List<WebElement> allColsDetails;

    @FindBy(css = "button[name='updatecart'][type='button']")
    WebElement removeProductButton;

    @FindBy(name = "updatecart")
    WebElement updateCartButton;
    @FindBy(className = "qty-input")
    WebElement updateQuantityField;
    @FindBy(id = "checkout")
    WebElement checkoutButton;
    @FindBy(id = "termsofservice")
    WebElement termsOfServiceButton;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void printProductDetails() {
        System.out.println(productDetailsField.getText());
        for (WebElement col : allColsDetails) {
            System.out.println(col.getText() + "\t");
        }
    }

    public void updateProductQuantity(String quantity) {
        updateQuantityField.clear();
        EnterText(updateQuantityField, quantity);
        clickButton(updateCartButton);
    }

    public void removeProductFromCart() {
        clickButton(removeProductButton);
        clickButton(updateCartButton);
    }

    public void openCheckoutPage() {
        clickButton(termsOfServiceButton);
        clickButton(checkoutButton);
        //Thread.sleep(3000);
    }
}
