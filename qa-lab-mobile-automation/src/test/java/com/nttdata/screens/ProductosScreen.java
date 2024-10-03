package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Frank Miranda
 */
public class ProductosScreen extends PageObject {

    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement titulo;

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnadd;

    public boolean isProductsDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(titulo));

        return titulo.isDisplayed();
    }

    public boolean isAddDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(btnadd));

        return btnadd.isDisplayed();
    }

}
