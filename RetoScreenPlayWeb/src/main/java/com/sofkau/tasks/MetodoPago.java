package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaDatosComprador.CAMPO_NOMBRE;
import static com.sofkau.ui.PaginaMetodoPago.*;
import static com.sofkau.ui.PaginaSeleccionar.AGREGAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class MetodoPago implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTION_PAGO_CONTRA_ENTREGA)
        );
    }

    public static MetodoPago metodoPago(){
        return new MetodoPago();
    }
}
