package discountTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class lifetimeDiscountTest extends ParentTest {

    @Test
    public void checkLifetimeDiscountTest() {
        loginPage.loginUser("1@i.ua", "111111");
        Assert.assertTrue("Avatar is not present", mainPage.isAvatarPresent());
        discountPage.chooseCustomerMenu();
        Assert.assertTrue("Infinity presents", discountPage.isInfinityPresent());
    }
}
