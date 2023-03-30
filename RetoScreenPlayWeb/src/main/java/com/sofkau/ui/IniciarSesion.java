package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesion {

    public static final Target OPTION_MI_CUENTA = Target.the("Opcion Mi Cuenta")
            .located(By.xpath("//a[@href='#Women']"));
}
