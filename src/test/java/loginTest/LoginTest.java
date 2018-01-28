package loginTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest{

    @Test //этот тест может быть запущен (JUnit с аннотацией)
    public void validLogin(){
        loginPage.loginUser("1@i.ua", "111111");
        Assert.assertTrue("Avatar is not present", mainPage.isAvatarPresent());

    }

}