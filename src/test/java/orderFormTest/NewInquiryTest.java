package orderFormTest;

import org.junit.Assert;
import org.junit.Test;
import parentTest.ParentTest;

public class NewInquiryTest extends ParentTest{

    @Test
    public void addNewOrder (){
        loginPage.loginUser("1@i.ua", "111111");
        Assert.assertTrue("Avatar is not present", mainPage.isAvatarPresent());
        inquiryPage.clickOnFreeInquiryButton();
        inquiryPage.choosePaperTypeOption(); // не отрабатывает из-за некорректного xpath
        inquiryPage.chooseEssayType();
        inquiryPage.chooseDisciplineOption(); // не отрабатывает из-за некорректного xpath
        inquiryPage.chooseEnglish();
        inquiryPage.clickOnConfirmationButton();
        Assert.assertTrue("New order present", inquiryPage.isNewUnpaidOrderPresent());

    }
}
