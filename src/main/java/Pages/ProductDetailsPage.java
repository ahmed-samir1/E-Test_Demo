package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage extends PageBase {
    @FindBy(tagName = "h1")
    public WebElement searchResultProductName;
    @FindBy(className = "price-value-4")
    public WebElement productPriceValue;
    @FindBy(css = "#bar-notification > div > p")
    public WebElement addToCartSuccessMessage;
    @FindBy(xpath = "//button[normalize-space()='Email a friend']")
    WebElement emailFriendPageLink;
    @FindBy(linkText = "Add your review")
    WebElement addYourReviewPageLink;

    @FindBy(xpath = "//button[@id='add-to-wishlist-button-4']")
    WebElement addToWishlistButton;


    //@FindBy(css ="body > div:nth-child(6) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(10) > div:nth-child(2) > button:nth-child(1)")
    @FindBy(xpath = "//div[@class='compare-products']//button[@type='button'][normalize-space()='Add to compare list']")
    WebElement addToCompareButton;

    //@FindBy(linkText = "product comparison")
    @FindBy(xpath = "//a[normalize-space()='product comparison']")
    WebElement productComparePageLink;

    /*@FindBy(css = "#bar-notification > div > p")
    public WebElement productAddedToWishlistNotification;*/

    @FindBy(xpath = "//a[normalize-space()='wishlist']")
    WebElement wishlistPageLink;

    @FindBy(css = "#add-to-cart-button-4")
    WebElement addToCartButton;
    @FindBy(css = "#bar-notification > div > p > a")
    WebElement cartPageLink;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 40);
    }

    public void openEmailFriendPage() {
        clickButton(emailFriendPageLink);
        //Thread.sleep(3000);
    }

    public void openAddProductReviewPage() {
        clickButton(addYourReviewPageLink);
    }

    public void addProductToWishlist() {
        wait.until(ExpectedConditions.visibilityOf(addToWishlistButton));
        clickButton(addToWishlistButton);
    }

    public void openWishListPage() {
        clickButton(wishlistPageLink);
    }

    public void addProductToCompare() {

        clickButton(addToCompareButton);
    }

    public void openProductComparisonPage() {

        clickButton(productComparePageLink);
    }

    public void addProductToCart() {

        clickButton(addToCartButton);
    }

    public void openCartPage() {

        clickButton(cartPageLink);
    }


}

