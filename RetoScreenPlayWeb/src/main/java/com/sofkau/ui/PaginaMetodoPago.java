package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMetodoPago {

    public static final Target OPTION_PAGO_CONTRA_ENTREGA = Target.the("Opcion Pago contra entrega")
            .located(By.xpath("(//a[@id='payment-group-custom201PaymentGroupPaymentGroup'])[1]"));


    public static final Target MENSAJE = Target.the("Mensaje")
            .located(By.cssSelector("fieldset[class='box-payment-group2 box-payment-option custom201PaymentGroupPaymentGroup'] p[class='payment-description']"));
}
