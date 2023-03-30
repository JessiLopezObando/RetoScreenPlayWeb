package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaBuscarProducto.*;
import static com.sofkau.ui.PaginaBuscarProducto.OPTION_COMPRA_Y_RECOGE;
import static com.sofkau.ui.PaginaDireccion.CAMPO_CIUDAD;
import static com.sofkau.ui.PaginaDireccion.OPTION_CIUDAD;


public class DireccionEnvio implements Task {

    private String ciudad;
    private String almacen;

    public DireccionEnvio laCiudad(String ciudad){
        this.ciudad=ciudad;
        return this;
    }

    public DireccionEnvio yConElAlmacen(String almacen){
        this.almacen=almacen;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTION_CIUDAD),
                Hit.the(Keys.ENTER).into(OPTION_CIUDAD)
        );
    }

    public static DireccionEnvio direccionEnvio(){
        return new DireccionEnvio();
    }
}
