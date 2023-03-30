package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaIniciarSesion {

    public static final Target OPTION_MI_CUENTA = Target.the("Opcion Mi Cuenta")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));

    public static final Target OPTION_INGRESE_CON_EMAIL_Y_CONTRASENNA = Target.the("Opcion Ingrese con Email y contraseña")
            .located(By.xpath("//div[contains(@class,'vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn')]//button[contains(@type,'button')]"));

    public static final Target CAMPO_EMAIL = Target.the("Campo Ingrese Email")
            .located(By.xpath("//input[contains(@placeholder,'Ingresa tu email')]"));

    public static final Target CAMPO_CONTRASENNA = Target.the("Campo Ingrese Contraseña")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_ENTRAR = Target.the("Boton Entrar")
            .located(By.cssSelector("button[type='submit'] div[class='vtex-button__label flex items-center justify-center h-100 ph5 ']"));

    public static final Target MESSAGE_HOLA = Target.the("Mensaje Hola de inicio de Sesion")
            .located(By.cssSelector(".exito-login-4-x-greetingsText.ml2"));





}
