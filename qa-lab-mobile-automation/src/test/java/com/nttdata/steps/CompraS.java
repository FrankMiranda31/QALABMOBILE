package com.nttdata.steps;


import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductosScreen;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

/**
 * @author Frank Miranda
 */
public class CompraS {

    ProductosScreen PD;
    LoginScreen LG;

    public void verificarapp(){
        Assert.assertTrue("Login no satisfactorio", PD.isProductsDisplayed());
    }


    public void clickmochila(){
        LG.clickmochila();
        PD.isAddDisplayed();
    }

    public void clickadd(){
        LG.clickadd();
    }
    public void clickpolo(){LG.clickmochila();}

    public void clicklampara(){LG.clicklampara();}


    private AndroidDriver driver;
    public void agregarcompra(String c,String m){

        if(m.equals("Sauce Labs Backpack" )) {
            LG.clickmochila();

        }

        if(m.equals("Sauce Labs Bolt T-Shirt" ))
        {  LG.clickpolo();

        }
        if(m.equals("Sauce Labs Bike Light" ))
        {

            LG.clicklampara();

        }


        int n=Integer.parseInt(c);

        for(int i=1;i<n;i++)
        {
            LG.clickmas();
        }
        LG.clickadd();

    }

    public void clickver(){
        LG.clickver();
    }

}
