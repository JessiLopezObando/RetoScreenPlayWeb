package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaSeleccionar.*;

public class Seleccionar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORDENAR_PRECIO),
                Click.on(MENOR_PRECIO),
                Click.on(AGREGAR)
        );
    }

    public static Seleccionar seleccionar(){
        return new Seleccionar();
    }
}
