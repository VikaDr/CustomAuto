package pages;

import libs.ActionsWithOurElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.*;

public class CustomerPage extends ParentPage{
    @FindBy(id = "UserBlockWhois__avatar")
    private WebElement hoverOnElem;

    @FindBy(xpath = ".//*[@href='/dashboard/profile']")
    private WebElement optionInHoverMenu;

    @FindBy(name = "oldPassword")
    private WebElement oldPassword;

    @FindBy(name = "newPassword")
    private WebElement newPassword;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = ".//*[text()='Update password']")
    private WebElement confirmButton;

    @FindBy(xpath = ".//*[text()='Password was updated']")
    private WebElement conformationMessage;

    public CustomerPage(WebDriver webDriver){
        super(webDriver, "/dashboard/profile");
    }

    public void chooseCustomerMenu(){
        moveToElemAndClick(webDriver,hoverOnElem,optionInHoverMenu);

        }

    public void inputOldPassword(String pass){
        enterTextIntoInput(oldPassword, pass);
    }

    public void inputNewPassword(String pass){
        enterTextIntoInput(newPassword, pass);
    }

    public void confirmNewPassword(String pass){
        enterTextIntoInput(confirmPassword, pass);
    }

    public void clickOnUpdatePassButton(){
       clickOnElement(confirmButton);
    }

    public boolean isConfirmationMessagePresent(){
        return isElementPresent(conformationMessage);
    }


}
