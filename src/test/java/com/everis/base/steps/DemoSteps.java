package com.everis.base.steps;

import com.everis.base.pageObject.DemoblazePage;
import com.everis.base.util.WebDriverUtils;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.concurrent.TimeUnit.SECONDS;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class DemoSteps {

    private static final Logger
            logger = LoggerFactory.getLogger(DemoSteps.class);
    public DemoblazePage demoblazePage;
    public String parentWinHandle;
    WebDriver driver = new ChromeDriver();

    public void pause(Integer second) {
        try {
            SECONDS.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public void openDemoBlaze() {
        demoblazePage.open();

        logger.info("Inicializando la pagina de demoblaze");
    }

    //logut
    public void hagoSignUp() {
        demoblazePage.signin2.click();
    }



    public void ingresoElUsuarioDemo(String Usuario) {
        demoblazePage.txtusuario.click();
        demoblazePage.txtusuario.sendKeys(Usuario);
        logger.info("Ingreso el usuario :" + Usuario);
    }

    public void ingresoLaClave(String Clave) {
        demoblazePage.txtclave.click();
        demoblazePage.txtclave.sendKeys(Clave);
        logger.info("Ingreso el usuario :" + Clave);
    }

    public void clickboton() {

        demoblazePage.btnup.click();
        logger.info("ingreso AlModulo Seguimiento");
    }
  //login
    public void hagoLogin() {
    demoblazePage.login2.click();
    }

    public void ingresoElUsuarioLogin(String User) {

        demoblazePage.loginusername.click();
        demoblazePage.loginusername.sendKeys(User);
        logger.info("Ingreso el user :" + User);
    }

    public void ingresoLaClaveLogin(String pass) {
        demoblazePage.loginpassword.click();
        demoblazePage.loginpassword.sendKeys(pass);
        logger.info("Ingreso el pass :" + pass);
    }

    public void clickbotonLogin() {

        demoblazePage.btnlin.click();
        logger.info("ingreso a comprar");
        pause(40);
    }

    public void MetodoSwitchHandle() {
        String handle = WebDriverUtils.getHandle(demoblazePage.getDriver(), parentWinHandle);
        getDriver().switchTo().window(handle);
    }

    public void MetodoSwitchContent() {
        getDriver().switchTo().defaultContent();
    }

    public void click_de_Laptop(){

        demoblazePage.Laptops.click();
        logger.info("selecciona la laptop");

    }

    public void click_de_Sony(){

        demoblazePage.linkSony.click();
        logger.info("elije sony");

    }

    public void agregar_Carrito(){

        demoblazePage.agregarCarro.click();
        logger.info("agregar carrito");
        driver.switchTo().alert().accept();

    }

    public void validar_Carrito() {
        demoblazePage.confirmar.click();
        logger.info("validar carrito");
    }

}
