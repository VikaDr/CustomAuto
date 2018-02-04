package customerTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class ChangePassTest extends ParentTest{
    @Test
    public void changePassTest(){
        loginPage.loginUser("1@i.ua", "111111");
        Assert.assertTrue("Avatar is not present", mainPage.isAvatarPresent());
        customerPage.chooseCustomerMenu();
        customerPage.inputOldPassword("111111");
        customerPage.inputNewPassword("111111");
        customerPage.confirmNewPassword("111111");
        customerPage.clickOnUpdatePassButton();
        Assert.assertTrue("Message presents", customerPage.isConfirmationMessagePresent());

    }



}
