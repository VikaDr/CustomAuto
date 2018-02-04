package parentTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CustomerPage;
import pages.InquiryPage;
import pages.LoginPage;
import pages.MainPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ParentTest {
    public WebDriver webDriver;
    protected MainPage mainPage;
    protected LoginPage loginPage;
    protected InquiryPage inquiryPage;
    protected CustomerPage customerPage;

    @Before
    public void setUp() {
        File fileFF = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//пробуй каждые полсекунды сделать это на протяжении 10 секунд

        mainPage = new MainPage(webDriver);
        loginPage = new LoginPage(webDriver);
        inquiryPage = new InquiryPage(webDriver);
        customerPage = new CustomerPage(webDriver);
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}