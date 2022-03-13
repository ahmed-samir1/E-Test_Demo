package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage extends PageBase {

    @FindBy(css = "h2[class='product-title'] a")
    WebElement productInProductListPage;

    public ProductListPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void openProductDetailsPage() {
        clickButton(productInProductListPage);
        // Thread.sleep(3000);
    }
}

