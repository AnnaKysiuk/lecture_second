package pages;

import org.openqa.selenium.WebDriver;

public class MyTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getConfiguredDriver();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.open();

        loginPage.fillEmailInput();
        loginPage.fillPasswordInput();
        loginPage.clickLoginBtn();

        quiteDriver(driver);


    }

    public static WebDriver initChromedriver(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}
