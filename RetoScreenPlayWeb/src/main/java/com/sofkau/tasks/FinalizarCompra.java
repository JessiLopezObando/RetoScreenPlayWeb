package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaDatosComprador.CAMPO_NOMBRE;
import static com.sofkau.ui.PaginaFinalizarCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FinalizarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ELEGIR_FECHA),
                Click.on(FECHA),
                Scroll.to(BOTON_CONTINUAR_COMPRA),
                WaitUntil.the(BOTON_CONTINUAR_COMPRA,isPresent()),
                WaitUntil.the(BOTON_CONTINUAR_COMPRA,isCurrentlyVisible()),
                WaitUntil.the(BOTON_CONTINUAR_COMPRA,isCurrentlyEnabled()),
                Click.on(BOTON_CONTINUAR_COMPRA)
        );
    }

    public static FinalizarCompra finalizarCompra(){
        return new FinalizarCompra();
    }
}
