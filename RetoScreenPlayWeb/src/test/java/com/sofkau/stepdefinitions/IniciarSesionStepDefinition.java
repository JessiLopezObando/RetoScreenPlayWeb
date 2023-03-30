package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.util.SetCredentials;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition extends Configuracion {

    List<String> credentials = SetCredentials.getEmailPasword();

    public IniciarSesionStepDefinition() throws IOException {
    }

    @Given("that I am on the Exito website")
    public void thatIAmOnTheExitoWebsite() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );

    }

    @When("I select the Mi cuenta option")
    public void iSelectTheMiCuentaOption() {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElEmail(credentials.get(0))
                        .yConLaContrasenna(credentials.get(1))
        );

    }

    @When("provide my user credentials email and password")
    public void provideMyUserCredentialsEmailAndPassword() {

    }

    @Then("I should see the message Hola indicating that the session has been successfully initiated")
    public void iShouldSeeTheMessageHolaIndicatingThatTheSessionHasBeenSuccessfullyInitiated() {

    }



}
