package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderDetailsPage extends PageBase {
    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-title > a.button-2.print-order-button")
    WebElement printOrderDetailsButton;
    @FindBy(linkText = "PDF Invoice")
    WebElement PDFInvoiceButton;

    public OrderDetailsPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void printOrderDetails() {
        // Thread.sleep(2000);
        clickButton(printOrderDetailsButton);
        // Thread.sleep(2000);
    }

    public void downloadPDFInvoice() {
        clickButton(PDFInvoiceButton);
    }
}
