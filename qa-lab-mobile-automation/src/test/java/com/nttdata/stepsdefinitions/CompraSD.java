package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CompraS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

/**
 * @author Frank Miranda
 */
public class CompraSD {

    @Steps
    CompraS compra;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
    }



    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        compra.verificarapp();
    }

    @When("agrego {} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String msg1, String msg2) {


        compra.agregarcompra(msg1,msg2);


    }

    @Then("valido que el carrito de compras actualice correctamente")
    public void validoQueElCarritoDeComprasActualiceCorrectamente() {
        compra.clickver();
    }


}
