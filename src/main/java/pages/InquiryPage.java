package pages;

import libs.ActionsWithOurElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.clickOnElement;
import static libs.ActionsWithOurElements.enterTextIntoInput;
import static libs.ActionsWithOurElements.selectOptionsInDropDown;

public class InquiryPage extends ParentPage {

    @FindBy(xpath = ".//*[text()='Free Inquiry']")
    private WebElement buttonFreeInquiry;

    @FindBy(className ="Select-placeholder")
    private WebElement dropDownPaperType;


    public InquiryPage(WebDriver webDriver) {
        super(webDriver,"/dashboard/inquiry");
    }

    public void clickOnFreeInquiryButton(){
        clickOnElement(buttonFreeInquiry);
    }

    public void choosePaperTypeOption(String option){

    }

}
