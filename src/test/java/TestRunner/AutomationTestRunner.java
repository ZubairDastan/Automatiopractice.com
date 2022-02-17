package TestRunner;

import Page.Page;
import Setup.EnvironmentSetup;
import org.testng.annotations.Test;

public class AutomationTestRunner extends EnvironmentSetup {
    @Test
    public void signup1(){
        driver.get("http://automationpractice.com/index.php");
        Page page = new Page(driver);
        page.signUp1();
    }

    @Test
    public void signup2(){
        driver.get("http://automationpractice.com/index.php");
        Page page = new Page(driver);
        page.signUp2();
    }
}
