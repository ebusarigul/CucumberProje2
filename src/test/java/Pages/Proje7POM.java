package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proje7POM extends Parent{
    public Proje7POM() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText="Create an Account")
    private WebElement createAnAccount;

    @FindBy(id="firstname")
    private WebElement firstname;

    @FindBy(id="lastname")
    private WebElement lastname;

    @FindBy(id="email_address")
    private WebElement emailaddress;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="password-confirmation")
    private WebElement passwordconfirmation;

    @FindBy(xpath="(//span[text()=\"Create an Account\"])[1]")
    private WebElement createAccountButton;

    @FindBy(xpath="//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
    private WebElement verifyLogin;


    //--------------------------------------------------------

    @FindBy(xpath="(//li[@class=\"authorization-link\"]/a)[1]")
    private WebElement signIn;

    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="pass")
    private WebElement pass;

    @FindBy(id="send2")
    private WebElement send2;

    @FindBy(xpath="(//li[@class=\"greet welcome\"]/span)[1]")
    private WebElement welcome;


    //--------------------------------------------------------

    @FindBy(xpath="(//span/button)[1]")
    private WebElement menu;

    @FindBy(linkText="My Account")
    private WebElement myAccount;

    @FindBy(xpath="//span[text()='Manage Addresses']")
    private WebElement manageAddresses;

    @FindBy(id="street_1")
    private WebElement street_1;

    @FindBy(id="city")
    private WebElement city;

    @FindBy(id="telephone")
    private WebElement telephone;

    @FindBy(id="zip")
    private WebElement zip;

    @FindBy(xpath="//span[text()=\"Save Address\"]")
    private WebElement saveAddressButton;

    @FindBy(id="country")
    private WebElement country;

    @FindBy(xpath="//select/option[@value='TR']")
    private WebElement turkey;

    @FindBy(xpath="//select/option[@value='GB']")
    private WebElement england;

    @FindBy(xpath="//select/option[@value='UA']")
    private WebElement ukraine;

    @FindBy(xpath="//*[@data-ui-id=\"message-success\"]/div")
    private WebElement addressVerify;

    @FindBy(xpath="//span[text()=\"Add New Address\"]")
    private WebElement addNewAddress;

    //--------------------------------------------------------

    @FindBy(xpath="//img[@alt=\"Fusion Backpack\"]")
    private WebElement fusionBackpack;

    @FindBy(id="product-addtocart-button")
    private WebElement addToCart;

    @FindBy(xpath="//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]")
    private WebElement addToCartConfirm;

    @FindBy(xpath="//a[@class=\"action showcart\"]")
    private WebElement showcart;

    @FindBy(id="top-cart-btn-checkout")
    private WebElement prodecedCheckout;

    @FindBy(xpath="(//button[@type=\"submit\"])[2]")
    private WebElement next;

    @FindBy(xpath="//button[@title=\"Place Order\"]")
    private WebElement placeOrder;

    @FindBy(xpath="//span[text()=\"Thank you for your purchase!\"]")
    private WebElement thankYouOrder;





    WebElement myElement;

    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "firstname" : myElement =firstname; break;
            case "lastname" : myElement =lastname; break;
            case "emailaddress" : myElement =emailaddress; break;
            case "password" : myElement =password; break;
            case "passwordconfirmation" : myElement =passwordconfirmation; break;
            case "email" : myElement =email; break;
            case "pass" : myElement =pass; break;
            case "street_1" : myElement =street_1; break;
            case "city" : myElement =city; break;
            case "telephone" : myElement =telephone; break;
            case "zip" : myElement =zip; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "createAnAccount" : myElement =createAnAccount; break;
            case "createAccountButton" : myElement =createAccountButton; break;
            case "signIn" : myElement =signIn; break;
            case "send2" : myElement =send2; break;
            case "menu" : myElement =menu; break;
            case "myAccount" : myElement =myAccount; break;
            case "manageAddresses" : myElement =manageAddresses; break;
            case "saveAddressButton" : myElement =saveAddressButton; break;
            case "country" : myElement =country; break;
            case "turkey" : myElement =turkey; break;
            case "england" : myElement =england; break;
            case "ukraine" : myElement =ukraine; break;
            case "addNewAddress" : myElement =addNewAddress; break;
            case "fusionBackpack" : myElement =fusionBackpack; break;
            case "addToCart" : myElement =addToCart; break;
            case "showcart" : myElement =showcart; break;
            case "prodecedCheckout" : myElement =prodecedCheckout; break;
            case "next" : myElement =next; break;
            case "placeOrder" : myElement =placeOrder; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "verifyLogin" : myElement =verifyLogin; break;
            case "welcome" : myElement =welcome; break;
            case "addressVerify" : myElement =addressVerify; break;
            case "thankYouOrder" : myElement =thankYouOrder; break;
            case "addToCartConfirm" : myElement =addToCartConfirm; break;

        }

        verifyContainsText(myElement,text);
    }

    public void searchAndDelete(String searchText){

        findAndSend("searchInput",searchText);//arama kutucuguna kelimeyi yaz
        findAndClick("searchButton");//arama butonuna bas

        waitUntilLoading();

        //GWD.Bekle(2);  // TODO: incelenecek
        findAndClick("deleteButton");//silme butonuna bas
        findAndClick("deleteDialogButton");//dialogdaki silme butonuna bas

    }

}
