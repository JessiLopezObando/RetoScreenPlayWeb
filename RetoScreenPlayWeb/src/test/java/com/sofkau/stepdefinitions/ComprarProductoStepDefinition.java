package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.util.SetCredentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

import static com.sofkau.questions.ConfirmacionCompra.confirmacionCompra;
import static com.sofkau.tasks.BuscarProducto.buscarProducto;
import static com.sofkau.tasks.Carrito.carrito;
import static com.sofkau.tasks.DireccionEnvio.direccionEnvio;
import static com.sofkau.tasks.FinalizarCompra.finalizarCompra;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.LlenarDatosComprador.llenarDatosComprador;
import static com.sofkau.tasks.MetodoPago.metodoPago;
import static com.sofkau.tasks.Seleccionar.seleccionar;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class ComprarProductoStepDefinition extends Configuracion {

    public static Logger LOGGER= Logger.getLogger(ComprarProductoStepDefinition.class);

    List<String> credentials = SetCredentials.getEmailPasword();

    public ComprarProductoStepDefinition() throws IOException {
    }

    @Given("that I am on the Exito website")
    public void thatIAmOnTheExitoWebsite() {
        try {
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );

            LOGGER.info("El actor ha accedido a la pagina web del Exito.");
        } catch (Exception e) {
            LOGGER.error("Ocurrio un error al abrir la pagina del Exito: " + e.getMessage());
            throw e;
        }
    }

    @When("I logging in using my credentials email and password")
    public void iLoggingInUsingMyCredentialsEmailAndPassword() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElEmail(credentials.get(0))
                            .yConLaContrasenna(credentials.get(1))
            );

            LOGGER.info("El usuario ha iniciado sesión con exito.");
        } catch (Exception e) {
            LOGGER.error("Ocurrio un error al iniciar sesion: " + e.getMessage());
            throw e;
        }
    }

    @When("I search for and add a low-priced product to my cart")
    public void iSearchForAndAddALowPricedProductToMyCart() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    buscarProducto()
                            .producto("frijoles"),
                    direccionEnvio(),
                    seleccionar(),
                    carrito()
            );

            LOGGER.info("El producto de bajo precio ha sido agregado al carrito exitosamente.");
        } catch (Exception e) {
            LOGGER.error("Ocurrio un error al buscar y agregar el producto de bajo precio al carrito: " + e.getMessage());
            throw e;
        }
    }

    @When("I proceed to checkout and enter my information")
    public void iProceedToCheckoutAndEnterMyInformation() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    llenarDatosComprador()
                            .conElNombre("Candelaria")
                            .yConElApellido("Sanchez Rincon")
                            .yConElCelular("3145127896")
                            .yElDocumento("108745362")
            );

            theActorInTheSpotlight().attemptsTo(
                    finalizarCompra(),
                    metodoPago()
            );

            LOGGER.info("Se han ingresado los datos del comprador y se ha finalizado la compra.");
        } catch (Exception e) {
            LOGGER.error("Ocurrio un error al ingresar los datos del comprador o al finalizar la compra: " + e.getMessage());
            throw e;
        }

    }

    @Then("I should see a confirmation message indicating a successful purchase.")
    public void iShouldSeeAConfirmationMessageIndicatingASuccessfulPurchase() {

        try {
            theActorInTheSpotlight().should(
                    seeThat(confirmacionCompra(),equalTo("Con el Pago contra entrega podr\u00E1s pagar en efectivo, con tarjeta d\u00E9bito o cr\u00E9dito al momento de la recepci\u00F3n de tu pedido. El titular de la tarjeta debe estar presente al momento del pago."))
            );

            LOGGER.info("La prueba ha pasado. Se encontro el mensaje esperado: " + confirmacionCompra());

        } catch (AssertionError e) {
            LOGGER.error("La prueba fallo. Error: " + e.getMessage());
            throw e;
        } catch (Exception e) {
            LOGGER.error("Ocurrio un error durante la ejecucion de la prueba. Error: " + e.getMessage());
            throw e;
        }
        quitarDriver();
    }


}



