package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.isElementPresent;
import static libs.ActionsWithOurElements.moveToElemAndClick;

public class DiscountPage extends ParentPage {

    @FindBy(id = "UserBlockWhois__avatar")
    private WebElement hoverOnElem;

    @FindBy(xpath = ".//*[@href='/dashboard/discounts']")
    private WebElement optionInHoverMenu;

    @FindBy(xpath = ".//*[@class='DiscountsForest__birds-bird-message-infinity']")
    private WebElement infinityPresent;

    public DiscountPage(WebDriver webDriver) {
        super(webDriver, "/dashboard/discounts");
    }

    public void chooseCustomerMenu(){
        moveToElemAndClick(webDriver,hoverOnElem,optionInHoverMenu);
    }

    public boolean isInfinityPresent(){
        return isElementPresent(infinityPresent);
    }
}
