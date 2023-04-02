package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarrito {

    public static final Target CARRITO = Target.the("Opcion Carrito")
            .located(By.xpath("(//*[name()='svg'][@class='vtex-menu-2-x-header-link-icon '])[2]"));

    public static final Target IR_A_PAGAR = Target.the("Boton ir a pagar")
            .located(By.xpath("//a[@id='cart-to-orderform']"));

}
