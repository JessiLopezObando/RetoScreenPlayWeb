package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprarProductoStepDefinition extends Configuracion {

    @Given("that I am on the Exito website")
    public void thatIAmOnTheExitoWebsite() {
        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );

    }

    @When("I select the Mi cuenta option")
    public void iSelectTheMiCuentaOption() {

    }

    @When("provide my user credentials email and password")
    public void provideMyUserCredentialsEmailAndPassword() {

    }

    @Then("I should see the message Hola indicating that the session has been successfully initiated")
    public void iShouldSeeTheMessageHolaIndicatingThatTheSessionHasBeenSuccessfullyInitiated() {

    }



}
