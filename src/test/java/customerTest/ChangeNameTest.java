package customerTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class ChangeNameTest extends ParentTest {

    @Test
    public void changeNameTest(){
        loginPage.loginUser("1@i.ua", "111111");
        Assert.assertTrue("Avatar is not present", mainPage.isAvatarPresent());
        customerPage.chooseCustomerMenu();
        customerPage.inputNewUserName("CustomTest");
        customerPage.clickOnUpdateProfileButton();
        Assert.assertTrue("Contact information updated", customerPage.isUpdatingContactMessagePresent());

    }
}
