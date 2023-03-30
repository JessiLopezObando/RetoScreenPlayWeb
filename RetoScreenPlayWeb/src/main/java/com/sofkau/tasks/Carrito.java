package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaCarrito.CARRITO;
import static com.sofkau.ui.PaginaSeleccionar.*;

public class Carrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CARRITO)
        );

    }

    public static Carrito carrito(){
        return new Carrito();
    }
}
