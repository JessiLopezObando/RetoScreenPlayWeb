package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSeleccionar {

    public static final Target ORDENAR_PRECIO = Target.the("Ordenar Precio")
            .located(By.cssSelector(".vtex-search-result-3-x-orderByText.c-muted-2"));

    public static final Target MENOR_PRECIO = Target.the("Ordenar Precio")
            .located(By.cssSelector("div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) div:nth-child(1) button:nth-child(5)"));

    public static final Target AGREGAR = Target.the("Boton Agregar")
            .located(By.xpath("(//span[@class='exito-vtex-components-4-x-buttonText' and text()='Agregar'])[1]"));



}
