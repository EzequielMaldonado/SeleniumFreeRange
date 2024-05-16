package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaCursosFRT;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class FreeRangeSteps {
    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursosFRT cursosPage = new PaginaCursosFRT();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        // landingPage.clickOnSectionNavigationBar(section);
        landingPage.clickOnCursosOption(section);
    }

    @When("I select Elegir Plan")
    public void selectElegirUnPlan() {
        landingPage.clickOnElegirUnPlanButton();
    }

    @And("Select Introducción al Testing")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLinkV2();
        fundamentosPage.clickIntroduccionTestingLink();
    }

    @Then("I can validate the options in the checkout page")
    public void checkOutValidatesPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia 1699  mes  12 productos",
                "Academia 176  ao  12 productos", "Free Gratis  3 productos");

        Assert.assertEquals(listaEsperada, lista);

    }

    public void SomeExamplesOfAssertions() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";

        Integer numero1 = 1;
        Integer numero2 = 2;

        Assert.assertEquals(numero1, numero2);

        // Verificar que dos valores no son iguales
        Assert.assertNotEquals(palabraEsperada, palabraEncontrada);

        // Verificar que dos valores son iguales
        Assert.assertEquals(palabraEsperada, palabraEncontrada);

        // Verificar que una condicion es verdadera
        Assert.assertTrue(palabraEncontrada.contains(palabraEsperada));

        // Verificar que una condicion es false
        Assert.assertFalse(palabraEncontrada.contains(palabraEsperada));

        // Soft Assertions: No detienen la ejecucion al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez
        soft.assertEquals(palabraEsperada, palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
        soft.assertNotEquals(palabraEncontrada, palabraEsperada);

        soft.assertAll();
    }

    // Esta es una funcion nueva para probar el uso de gitHub
    public void thisIsATest() {
        System.out.println("This is a test");
    }
    // Este es otro cambio para seguir probando

}
