package pages;

import static libs.ActionsWithOurElements.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage {

    @FindBy(id = "UserBlockWhois__avatar")
    private WebElement avatar;

    public MainPage(WebDriver webDriver) { //конструктор не возвращает значения и называется как класс (создается с помощью Alt + insert)
        super(webDriver, "/");
    }

    public boolean isAvatarPresent() {
        return isElementPresent(avatar);
    }
}