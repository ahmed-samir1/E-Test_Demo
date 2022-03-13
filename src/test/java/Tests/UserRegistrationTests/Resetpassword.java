package Tests.UserRegistrationTests;

import Pages.HomePage;
import Pages.UserLoginPage;
import Tests.TestBases.TestBase;
import org.testng.annotations.Test;

public class Resetpassword extends TestBase {
    HomePage home;

    UserLoginPage loginPage;


    @Test()
    public void testrestpasssword() {
        home = new HomePage(driver);
        loginPage = new UserLoginPage(driver);
        home.openLoginPage();
        loginPage.forgetpassword();
        loginPage.addemailaddress("Demo@test1.com");

    }
}
