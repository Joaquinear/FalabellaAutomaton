package ui.falabella;

import org.openqa.selenium.By;

public class UiFalabellaPay {
    //==============================================
    public static By addMoreItem = By.xpath("//button[@title='Aumentar la cantidad']");
    public static By btnGoToBuy = By.xpath("//button[text()='Ir a comprar']");
    //-----------------Textos de compra final--------------------------
    public static By getBolsaDeCompras = By.xpath("(//div/span[text()='Bolsa de Compras'])[2]");
    public static By getDeliveredText = By.xpath("//div/span[text()='Despacho']");

    public static By getPayText = By.xpath("//div/span[text()='Pago']");

    //-------------------Delivered-----------------------
    public static By modeDeliver = By.xpath("//h2[text()='Elige tus opciones de despacho']");
    public static By departament = By.id("region");
    public static By city = By.id("ciudad");
    public static By neighborhood = By.id("comuna");
    public static By btnContinue = By.xpath("(//button[text()='Continuar'])[2]");

    //---------------Despues del continuar---------------------------------------------------//
    public static By deliveredHome = By.xpath("//h3[contains(text(),'Despacho a domicilio')]");
    public static By address = By.id("address");
    public static By Departament = By.id("departmentNumber");
    public static By btnEnterAddress = By.xpath("//button[@name='useAddress']");
    public static By BtnContinuarGoToPay = By.xpath("//button[text()='Continuar']");
    public static By TexPayLastStep = By.xpath("//span[text()='Pago']");
}
