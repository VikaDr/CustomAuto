package customerTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import parentTest.ParentTest;

public class ChangePassTest extends ParentTest{
    @Test
    public void changePassTest(){
        loginPage.loginUser("1@i.ua", "111111");
        Assert.assertTrue("Avatar is not present", mainPage.isAvatarPresent());
        customerPage.chooseCustomerMenu();

    }



}
