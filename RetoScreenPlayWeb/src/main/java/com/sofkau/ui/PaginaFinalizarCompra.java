package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinalizarCompra {

    public static final Target BOTON_ELEGIR_FECHA = Target.the("Boton Elegir fecha")
            .located(By.xpath("//button[contains(@class, 'vtex-omnishipping-1-x-dateLink') and contains(@class, 'scheduled-delivery-choose') and contains(text(), 'Elija una fecha de entrega')]"));

    public static final Target FECHA = Target.the("Fecha")
            .located(By.xpath("//div[@aria-label='day-3']"));

    public static final Target BOTON_CONTINUAR_COMPRA = Target.the("Boton Continuar")
            .located(By.xpath("//button[@id='btn-go-to-payment']"));




}
