package ui.falabella;

import org.openqa.selenium.By;

public class UiFalabellaPay {
    public static By departament = By.id("region");
    public static By city = By.id("ciudad");
    public static By neighborhood = By.id("comuna");
    public static By BtnContinue = By.xpath("(//button[text()='Continuar'])[2]");
    //---------------Despues del continuar---------------------------------------------------//
    public static By address = By.id("address");
    public static By Departament = By.id("departmentNumber");
    public static By btnEnterAddress = By.xpath("//button[@name='useAddress']");
    public static By BtnContinuarGoToPay = By.xpath("//button[text()='Continuar']");
    public static By TexPayLastStep = By.xpath("//span[text()='Pago']");
}
