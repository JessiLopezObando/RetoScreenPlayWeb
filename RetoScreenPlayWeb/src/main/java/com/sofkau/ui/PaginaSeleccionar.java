package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSeleccionar {

    public static final Target ORDENAR_PRECIO = Target.the("Ordenar Precio")
            .located(By.cssSelector(".vtex-search-result-3-x-orderByText.c-muted-2"));

    public static final Target MENOR_PRECIO = Target.the("Ordenar Precio")
            .located(By.cssSelector("//button[normalize-space()='Menor precio primero']"));

    public static final Target AGREGAR = Target.the("Ordenar Precio")
            .located(By.cssSelector("(//button[contains(@type,'button')])[3]"));



}
