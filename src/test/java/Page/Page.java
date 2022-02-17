package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page {
    WebDriver webDriver;

    @FindBy(className = "login")
    WebElement btnLogin;
    @FindBy(id = "email_create")
    WebElement emailField;
    @FindBy(id = "SubmitCreate")
    WebElement btnSubmitCreate;
    @FindBy(id = "uniform-id_gender1")
    WebElement radioMr;
    @FindBy(id = "customer_firstname")
    WebElement fastName;
    @FindBy(id = "customer_lastname")
    WebElement lastName;
    @FindBy(id = "passwd")
    WebElement password;
    @FindBy(id = "address1")
    WebElement address;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "id_state")
    WebElement drpDwnState;
    @FindBy(id = "postcode")
    WebElement postCode;
    @FindBy(id = "phone_mobile")
    WebElement mobile;
    @FindBy(id = "alias")
    WebElement alias;
    @FindBy(id = "submitAccount")
    WebElement btnSubmitSignUp;
    @FindBy(id = "email")
    WebElement loginEmail;


    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void signUp1(){
        btnLogin.click();
        emailField.sendKeys("test101@test.test");
        btnSubmitCreate.click();
        radioMr.click();
        fastName.sendKeys("Test");
        lastName.sendKeys("User");
        password.sendKeys("123456");
        address.sendKeys("Street, State, Country");
        city.sendKeys("Tokyo");
        Select select = new Select(drpDwnState);
        select.selectByValue(String.valueOf(6));
        postCode.sendKeys("80202");
        mobile.sendKeys("159753456789");
        alias.clear();
        alias.sendKeys("This is alias");
        btnSubmitSignUp.click();
    }

    public void signUp2(){
        btnLogin.click();
        emailField.sendKeys("test102@test.test");
        btnSubmitCreate.click();
        radioMr.click();
        fastName.sendKeys("Test");
        lastName.sendKeys("User");
        password.sendKeys("123456");
        address.sendKeys("Street, State, Country");
        city.sendKeys("Tokyo");
        Select select = new Select(drpDwnState);
        select.selectByValue(String.valueOf(6));
        postCode.sendKeys("80202");
        mobile.sendKeys("159753456789");
        alias.clear();
        alias.sendKeys("This is alias");
        btnSubmitSignUp.click();
    }

    public void login(){
        loginEmail.sendKeys("");
    }

}
