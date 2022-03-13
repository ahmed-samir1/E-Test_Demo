package Tests.UserRegistrationTests;

import Pages.HomePage;
import Pages.UserLoginPage;
import Pages.UserRegistrationPage;
import Tests.TestBases.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase {
    HomePage home;
    UserRegistrationPage userRegister;
    UserLoginPage loginPage;


    @Test
    public void testUserCanRegisterSuccessfully() {
        home = new HomePage(driver);
        userRegister = new UserRegistrationPage(driver);
        home.openRegistrationPage();
        userRegister.userRegistration("ahmed", "samir",
                "testFWD@test.com", "ahmed123456", "30",
                "December", "1987");
        Assert.assertTrue(userRegister.registrationSuccessMessage.isDisplayed());
    }

    @Test(dependsOnMethods = {"testUserCanRegisterSuccessfully"})
    public void testRegisteredUserCanLogout() {
        userRegister = new UserRegistrationPage(driver);
        userRegister.RegisteredUserLogout();
    }


}
