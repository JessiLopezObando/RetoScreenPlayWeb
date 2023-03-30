package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {

    public static final Target OPTION_CIUDAD = Target.the("Opcion Ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target OPTION_TIENDA = Target.the("Boton seleccionar tienda")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));

    public static final Target BOTON_CONFIRMAR = Target.the("Boton seleccionar tienda")
            .located(By.xpath("//button[normalize-space()='Confirmar']"));

    public static final Target BOTON_SALIR = Target.the("Boton Salir")
            .located(By.xpath("//*[name()='path' and contains(@data-name,'Path 373')]"));



}
