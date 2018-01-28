package pages;

import libs.ActionsWithOurElements;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.clickOnElement;
import static libs.ActionsWithOurElements.enterTextIntoInput;
import static libs.ActionsWithOurElements.selectOptionsInDropDown;

public class OrderFormPage extends ParentPage {

    @FindBy(xpath = ".//a[@href='/dashboard/orders/create']")
    private WebElement buttonNewOrder;

    @FindBy(className ="Select-placeholder")
    private WebElement dropDownPaperType;


    public OrderFormPage(WebDriver webDriver) {
        super(webDriver,"/dashboard/orders/create");
    }

    public void clickOnNewOrderButton(){
        clickOnElement(buttonNewOrder);
    }

    public void choosePaperTypeOption(String option){
        selectOptionsInDropDown(dropDownPaperType, option);
    }

}
