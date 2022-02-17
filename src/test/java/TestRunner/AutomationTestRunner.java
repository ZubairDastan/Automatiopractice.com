package TestRunner;

import Page.Page;
import Setup.EnvironmentSetup;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutomationTestRunner extends EnvironmentSetup {
    @DataProvider
    public static Object[][] Login() {
        return new Object[][]{{"test201@test.test", "123456"}, {"test202@test.test", "123456"}};
    }

    @Test(priority = 1, groups = "Purchase")
    public void signup1(){
        driver.get("http://automationpractice.com/index.php");
        Page page = new Page(driver);
        page.signUp1();
    }

    @Test(priority = 2, groups = "Purchase")
    public void signup2(){
        driver.get("http://automationpractice.com/index.php");
        Page page = new Page(driver);
        page.signUp2();
    }

    @Test(priority = 3, groups = "Purchase", dataProvider ="Login")
    public void chooseDress(String mail, String pass) throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        Page page = new Page(driver);
        page.casual(mail, pass);
    }
}
