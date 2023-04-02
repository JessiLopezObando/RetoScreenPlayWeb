package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

import static com.sofkau.ui.PaginaSeleccionar.*;

public class Seleccionar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORDENAR_PRECIO),
                Click.on(MENOR_PRECIO),
                WaitUntil.the(AGREGAR,isPresent()),
                WaitUntil.the(AGREGAR,isCurrentlyVisible()),
                WaitUntil.the(AGREGAR,isCurrentlyEnabled()),
                WaitUntil.the(AGREGAR,isClickable()),
                Click.on(AGREGAR)
        );
    }

    public static Seleccionar seleccionar(){
        return new Seleccionar();
    }
}
