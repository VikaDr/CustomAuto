package pages;

import libs.ActionsWithOurElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends ParentPage{
    @FindBy(id = "UserBlockWhois__avatar")
    private WebDriver hoverOnElem;

    @FindBy(className = "UserBlock__link UserBlock__link-profile")
    private WebElement optionInHoverMenu;

    public CustomerPage(WebDriver webDriver){
        super(webDriver, "/dashboard/profile");
    }

    public void chooseCustomerMenu(){
        ActionsWithOurElements.moveToElemAndClick(hoverOnElem, optionInHoverMenu);

        }


}
