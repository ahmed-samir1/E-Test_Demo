package Tests.HoverMenuTests;

import Pages.HomePage;
import Tests.TestBases.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hoverOnMenuTest extends TestBase {
    HomePage homePageObj;


    @Test
    public void testUserCanSelectSubCategoriesFromHoverMenu() {
        homePageObj = new HomePage(driver);
        homePageObj.openNotebooksMenuPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
    }

    @Test
    public void testUserCanSelectcolorforshoes() throws InterruptedException {
        homePageObj = new HomePage(driver);
        homePageObj.openshoes();
        Assert.assertTrue(driver.getCurrentUrl().contains("shoes"));


    }
}
