package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccion {

    public static final Target OPTION_CIUDAD = Target.the("Opcion Ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target CAMPO_CIUDAD = Target.the("Opcion Ciudad")
            .located(By.xpath("(//input[@id='react-select-input-f4db7d4f-ab75-4d11-93e9-a1bf95cae513'])[1]"));

}
