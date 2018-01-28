package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static libs.ActionsWithOurElements.*;


public class LoginPage extends ParentPage{
    @FindBy(xpath = ".//*/button[contains(text(), 'Returning customer')]")
    private WebElement buttonClient;

    @FindBy(name = "email")
    private WebElement inputLogin;

    @FindBy(name = "password")
    private WebElement inputPassWord;

    @FindBy(xpath = ".//*/button[contains(text(),'Sign')]")
    private WebElement buttonSubmit;

    public LoginPage(WebDriver webDriver) {
        super(webDriver,"/dashboard/orders?tab=recent");
    }

    public void openLoginPage(){
        try {
            webDriver.get("https://www.customwritings.com/dashboard/authorization/");
            logger.info("Login page was opened");
        }catch (Exception e){
            logger.error("Can not open url");
            Assert.fail("Can not open url");
        }
    }

    public void clickOnReturningClientButton(){
        clickOnElement(buttonClient);
    }

    public void enterTextIntoInputLogin(String login){
        enterTextIntoInput(inputLogin,login);
    }

    public void enterTextIntoInputPass(String pass){
        enterTextIntoInput(inputPassWord,pass);
    }

    public void clickOnSubmitButton(){
        clickOnElement(buttonSubmit);
    }

    public void loginUser(String login, String pass) {
        openLoginPage();
        clickOnReturningClientButton();
        enterTextIntoInputLogin(login);
        enterTextIntoInputPass(pass);
        clickOnSubmitButton();
    }

    public boolean isLoginInputDisplay() {
        return isElementPresent(inputLogin);
    }
}
