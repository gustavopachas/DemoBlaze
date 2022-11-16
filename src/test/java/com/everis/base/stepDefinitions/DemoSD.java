package com.everis.base.stepDefinitions;

import com.everis.base.steps.DemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DemoSD {

    @Steps
    DemoSteps demoSteps;

    @Given("Inicializando la pagina de demoblaze")
    public void InicializandolapaginaDemoBlaze() {
        demoSteps.openDemoBlaze();
    }
    ///logut
    @When("hago click a sign up")
    public void hagoSignUp() {
        demoSteps.hagoSignUp();
    }

    @And("ingreso el usuario demo {string}")
    public void ingresoElUsuarioDemo(String Usuario) {
        demoSteps.ingresoElUsuarioDemo(Usuario);
    }

    @And("ingreso la clave {string}")
    public void ingresoLaClave(String Clave) {
        demoSteps.ingresoLaClave(Clave);
    }

    @Then("click boton")
    public void clickboton() {
        demoSteps.clickboton();
    }

 ////login
    @When("hago click a Login")
    public void hagoLogin() {
     demoSteps.hagoLogin();
    }


    @And("ingreso el usuario login {string}")
    public void ingresoElUsuarioLogin(String User) {
        demoSteps.ingresoElUsuarioLogin(User);
    }

    @And("ingreso la clave login {string}")
    public void ingresoLaClaveLogin(String pass) {
        demoSteps.ingresoLaClaveLogin(pass);
    }

    @And("click boton login")
    public void clickbotonLogin() {
        demoSteps.clickbotonLogin();
    }

    @When("click de laptop")
    public void click_de_Laptop() {
        demoSteps.click_de_Laptop();
    }

    @When("click de sony")
    public void click_de_Sony() {
        demoSteps.click_de_Sony();
    }

    @And("agregar carrito")
    public void agregar_Carrito() {
        demoSteps.agregar_Carrito();
    }

    @Then("validar el carrito")
    public void validar_Carrito() {
        demoSteps.validar_Carrito();
    }
}
