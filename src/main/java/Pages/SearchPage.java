package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends PageBase {

    @FindBy(id = "small-searchterms")
    WebElement searchField;
    @FindBy(css = "body > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > form:nth-child(1) > button:nth-child(2)")
    WebElement searchButton;
    @FindBy(id = "ui-id-1")
    List<WebElement> autoCompleteListMenu;

    public SearchPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 50);
    }

    public void searchProductUsingSearchButton(String searchItem) {
        wait.until(ExpectedConditions.visibilityOf(searchField));
        EnterText(searchField, searchItem);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        clickButton(searchButton);
        //Thread.sleep(3000);
    }

    public void searchProductUsingAutoSuggestMenu(String searchItem) {
        wait.until(ExpectedConditions.visibilityOf(searchField));
        EnterText(searchField, searchItem);
        wait.until(ExpectedConditions.visibilityOfAllElements(autoCompleteListMenu));
        autoCompleteListMenu.get(0).click();
        //Thread.sleep(3000);
    }

}
