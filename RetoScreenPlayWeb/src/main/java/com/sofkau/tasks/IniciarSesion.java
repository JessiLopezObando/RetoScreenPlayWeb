package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaIniciarSesion.*;

public class IniciarSesion implements Task {

    private String email;
    private String contrasenna;

    public IniciarSesion conElEmail(String email){
        this.email=email;
        return this;
    }

    public IniciarSesion yConLaContrasenna(String contrasenna){
        this.contrasenna=contrasenna;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPTION_MI_CUENTA),
                Click.on(OPTION_INGRESE_CON_EMAIL_Y_CONTRASENNA),
                Enter.theValue(email).into(CAMPO_EMAIL),
                Enter.theValue(contrasenna).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_ENTRAR)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
