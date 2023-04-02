package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.statematchers.IsSelectedMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.server.handler.ClickElement;

import static com.sofkau.ui.PaginaDatosComprador.*;
import static com.sofkau.ui.PaginaDireccion.BOTON_SALIR;
import static com.sofkau.ui.PaginaSeleccionar.AGREGAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class LlenarDatosComprador implements Task {

    private String nombre;
    private String apellidos;
    private String celular;
    private String documento;

    public LlenarDatosComprador conElNombre(String nombre){
        this.nombre=nombre;
        return this;
    }

    public LlenarDatosComprador yConElApellido(String apellidos){
        this.apellidos=apellidos;
        return this;
    }

    public LlenarDatosComprador yConElCelular(String celular){
        this.celular=celular;
        return this;
    }

    public LlenarDatosComprador yElDocumento(String documento){
        this.documento=documento;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        if (!CAMPO_ACEPTO.resolveFor(actor).isSelected()) {
            actor.attemptsTo(Click.on(CAMPO_ACEPTO));
        }
        actor.attemptsTo(

                WaitUntil.the(CAMPO_NOMBRE,isPresent()),
                WaitUntil.the(CAMPO_NOMBRE,isCurrentlyVisible()),
                WaitUntil.the(CAMPO_NOMBRE,isCurrentlyEnabled()),

                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellidos).into(CAMPO_APELLIDO),
                Enter.theValue(celular).into(CAMPO_CELULAR),
                Enter.theValue(documento).into(CAMPO_DOCUMENTO),

                Enter.theValue(nombre).into(CAMPO_NOMBRE),
                Enter.theValue(apellidos).into(CAMPO_APELLIDO),
                Enter.theValue(celular).into(CAMPO_CELULAR),
                Enter.theValue(documento).into(CAMPO_DOCUMENTO),

                Click.on(BOTON_CONTINUAR)

        );

    }

    public static LlenarDatosComprador llenarDatosComprador(){
        return new LlenarDatosComprador();
    }
}
