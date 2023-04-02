package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDatosComprador {

    public static final Target CAMPO_NOMBRE = Target.the("Campo Nombre")
            .located(By.xpath("//input[@id='client-first-name']"));

    public static final Target CAMPO_APELLIDO = Target.the("Campo Apellidos")
            .located(By.xpath("//input[@id='client-last-name']"));

    public static final Target CAMPO_CELULAR = Target.the("Campo Celular")
            .located(By.xpath("//input[@id='client-phone']"));

    public static final Target CAMPO_DOCUMENTO = Target.the("Campo Documento")
            .located(By.xpath("//input[@id='client-new-document']"));

    public static final Target CAMPO_ACEPTO = Target.the("Campo Acepto")
            .located(By.xpath("(//input[@type='checkbox'])[3]"));

    public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar")
            .located(By.xpath("//button[@id='go-to-shipping']"));



}
