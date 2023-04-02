package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.sofkau.ui.PaginaMetodoPago.MENSAJE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;

public class ConfirmacionCompra implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE.resolveFor(actor).getText();
    }

    public static ConfirmacionCompra confirmacionCompra() {
        return new ConfirmacionCompra();
    }

}
