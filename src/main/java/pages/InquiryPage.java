package pages;

import libs.ActionsWithOurElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.*;

public class InquiryPage extends ParentPage {

    @FindBy(xpath = ".//*[text()='Free Inquiry']")
    private WebElement buttonFreeInquiry;

    @FindBy(xpath = ".//*[text()='Type of paper']/../div") // .//*[@id='react-select-3--value']/div[1]
    private WebElement choosePaperType;

    @FindBy(xpath = ".//*[text()='Essay (any type)']")
    private WebElement chooseEssay;

    @FindBy(xpath = ".//*[text()='Discipline']/../div") // .//*[@id='react-select-4--value']/div[1]
    private WebElement chooseDisciplineType;

    @FindBy(xpath = ".//*[text()='English 101']")
    private WebElement chooseEnglish;

    @FindBy(xpath = ".//*[text()='Place Free Inquiry']")
    private WebElement confirmInquiryButton;

    @FindBy(xpath = ".//*[text()='Waiting for payment']")
    private WebElement newOrder;

    public InquiryPage(WebDriver webDriver) {
        super(webDriver,"/dashboard/inquiry");
    }

    public void clickOnFreeInquiryButton(){
        clickOnElement(buttonFreeInquiry);
    }

    public void choosePaperTypeOption(){
        clickOnElement(choosePaperType);
    }

    public void chooseEssayType(){
        clickOnElement(chooseEssay);
    }

    public void chooseDisciplineOption(){
        clickOnElement(chooseDisciplineType);
    }

    public void chooseEnglish(){
        clickOnElement(chooseEnglish);
    }

    public void clickOnConfirmationButton(){
        clickOnElement(confirmInquiryButton);
    }

    public boolean isNewUnpaidOrderPresent(){
        return isElementPresent(newOrder);
    }


}
