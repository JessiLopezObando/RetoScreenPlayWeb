package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaBuscarProducto {

    public static final Target OPTION_MERCADO = Target.the("Opcion Mercado")
            .located(By.xpath("//a[@id='header-tabMercado']"));

    public static final Target CAMPO_BUSCAR = Target.the("Campo Buscar")
            .located(By.xpath("//input[@placeholder='Buscar en exito.com']"));

    public static final Target BOTON_LUPA = Target.the("Boton Lupa")
            .located(By.xpath("(//button[@class=' vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3'])[1]"));

    public static final Target OPTION_ENVIO_DOMICILIO = Target.the("Opcion envio domicilio")
            .located(By.xpath(".vtex-search-result-3-x-orderByText.c-muted-2"));

    public static final Target OPTION_ENVIAR_OTRA_DIRECCION = Target.the("Opcion enviar otra direccion")
            .located(By.xpath("//button[normalize-space()='Enviar a otra dirección']"));

    public static final Target OPTION_COMPRA_Y_RECOGE = Target.the("Opcion enviar otra direccion")
            .located(By.xpath("(//button[@class='exito-geolocation-3-x-active'])[1]"));

}
