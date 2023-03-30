package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.util.SetCredentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.log4j.Logger;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

import static com.sofkau.tasks.BuscarProducto.buscarProducto;
import static com.sofkau.tasks.DireccionEnvio.direccionEnvio;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.Seleccionar.seleccionar;
import static com.sofkau.ui.PaginaIniciarSesion.MESSAGE_HOLA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductoStepDefinition extends Configuracion {

    public static Logger LOGGER= Logger.getLogger(ComprarProductoStepDefinition.class);

    List<String> credentials = SetCredentials.getEmailPasword();

    public ComprarProductoStepDefinition() throws IOException {
    }

    @Given("that I am on the Exito website")
    public void thatIAmOnTheExitoWebsite() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );

    }

    @When("I logging in using my credentials email and password")
    public void iLoggingInUsingMyCredentialsEmailAndPassword() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElEmail(credentials.get(0))
                        .yConLaContrasenna(credentials.get(1))
        );
    }

    @When("I search for and add a low-priced product to my cart")
    public void iSearchForAndAddALowPricedProductToMyCart() {
        theActorInTheSpotlight().attemptsTo(
                buscarProducto()
                        .producto("frijoles")
        );

        theActorInTheSpotlight().attemptsTo(
                direccionEnvio()

        );

        theActorInTheSpotlight().attemptsTo(
                seleccionar()
        );
    }

    @When("I proceed to checkout and enter my information")
    public void iProceedToCheckoutAndEnterMyInformation() {

    }

    @Then("I should see a confirmation message indicating a successful purchase.")
    public void iShouldSeeAConfirmationMessageIndicatingASuccessfulPurchase() {

    }



}
