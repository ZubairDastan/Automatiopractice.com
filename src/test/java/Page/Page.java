package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
    @FindBy(id = "passwd")
    WebElement loginPass;
    @FindBy(id = "SubmitLogin")
    WebElement btnSubmitLogin;

    @FindBy(xpath = "//a[@title ='Dresses']")
    List<WebElement> hoverDress;
    @FindBy(xpath = "//a[@title = 'Casual Dresses']")
    List<WebElement> selectCasual;
    @FindBy(xpath = "//*[@title='Printed Dress']")
    List<WebElement> hoverProduct;
    @FindBy(xpath = "//a[@title = 'Add to cart']")
    WebElement addToCart;
    @FindBy(className = "cross")
    WebElement cross;

    @FindBy(xpath = "//a[@title= 'T-shirts']")
    List<WebElement> tShirt;
    @FindBy(className = "layered_color")
    List<WebElement> filterColor;
    @FindBy(xpath = "//*[@title= 'Faded Short Sleeve T-shirts']")
    List<WebElement> productHover;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    List<WebElement> checkOut;
    @FindBy(name="processAddress")
    WebElement btnCheckOut;
    @FindBy(id = "uniform-cgv")
    WebElement checkMark;
    @FindBy(name="processCarrier")
    WebElement btnCarrier;
    @FindBy(className = "cheque")
    WebElement cheque;
    @FindBy(css = "button")
    List<WebElement> btnConfirm;
    @FindBy(className = "logout")
    WebElement signOut;


    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void signUp1(){
        btnLogin.click();
        emailField.sendKeys("test201@test.test");
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
        signOut.click();
    }

    public void signUp2(){
        btnLogin.click();
        emailField.sendKeys("test202@test.test");
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
        signOut.click();
    }

    public void casual(String mail, String pass) throws InterruptedException {
        btnLogin.click();
        loginEmail.sendKeys(mail);
        loginPass.sendKeys(pass);
        btnSubmitLogin.click();
        Actions actions = new Actions(webDriver);
        actions.moveToElement(hoverDress.get(1)).perform();
        selectCasual.get(1).click();
        actions.moveToElement(hoverProduct.get(1)).perform();
        Thread.sleep(1000);
        addToCart.click();
        cross.click();
        tShirt.get(1).click();
        filterColor.get(1).click();
        actions.moveToElement(productHover.get(1)).perform();
        addToCart.click();
        checkOut.get(0).click();
        Thread.sleep(1000);
        checkOut.get(1).click();
        Thread.sleep(1000);
        btnCheckOut.click();
        checkMark.click();
        btnCarrier.click();
        cheque.click();
        btnConfirm.get(1).click();
        signOut.click();
    }

}
