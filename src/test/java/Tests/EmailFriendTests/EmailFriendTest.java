package Tests.EmailFriendTests;


import Pages.*;
import Tests.TestBases.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailFriendTest extends TestBase {
    String yourEmail = "demoahmed@demo.com";
    String friendEmail = "freind11@demo.com";
    String personalMsg = "Hello, have a look on this awesome product";
    HomePage homeObj;
    UserRegistrationPage userRegisterObj;
    SearchPage searchObj;
    ProductListPage productListObj;
    ProductDetailsPage productDetailsObj;
    EmailFriendPage emailFriendObj;


    @Test
    public void testSendEmailToFriend() {
        homeObj = new HomePage(driver);
        userRegisterObj = new UserRegistrationPage(driver);
        searchObj = new SearchPage(driver);
        productListObj = new ProductListPage(driver);
        productDetailsObj = new ProductDetailsPage(driver);
        emailFriendObj = new EmailFriendPage(driver);
        homeObj.openRegistrationPage();
        userRegisterObj.userRegistration("Ahmed", "samir",
                yourEmail, "ahmed123", "30",
                "December", "1987");
        searchObj.searchProductUsingSearchButton("Apple MacBook Pro 13-inch");
        productListObj.openProductDetailsPage();
        productDetailsObj.openEmailFriendPage();
        emailFriendObj.emailProductToFriend(friendEmail, personalMsg);
        Assert.assertTrue(emailFriendObj.emailFriendSuccessMessage.getText().contains("message has been sent"));
    }
}
