package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaBuscarProducto.*;


public class BuscarProducto implements Task {

    private String producto;

    public BuscarProducto producto(String producto){
        this.producto=producto;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTION_MERCADO),
                Enter.theValue(producto).into(CAMPO_BUSCAR),
                Click.on(BOTON_LUPA)
        );
    }

    public static BuscarProducto buscarProducto(){
        return new BuscarProducto();
    }
}
