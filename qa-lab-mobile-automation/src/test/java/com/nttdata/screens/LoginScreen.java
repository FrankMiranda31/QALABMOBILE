package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement btnlampara;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement btnpolo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement btnmochila;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private WebElement lblErrorMessage;

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnadd;

    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnmas;


    @AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnver;


    public void clickmochila(){
        
        btnmochila.click();
    }

    public void clickpolo(){

        btnpolo.click();
    }

    public void clicklampara(){

        btnlampara.click();
    }

    public void clickadd(){

        btnadd.click();
    }

    public void clickmas(){
        btnmas.click();
    }
    public void clickver(){
        btnver.click();

    }
    public String getErrorMessage(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(lblErrorMessage));
        return lblErrorMessage.getText();
    }


}
