package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.MercadoLibreSearchPage;

public class MercadoLibreSearchSteps {

    MercadoLibreSearchPage meli = new MercadoLibreSearchPage();

    @Given("^the user navigates to www.mercadolibre.com.ar$")
    public void navigateToMeli(){
        meli.navigateToMeli();
    }

    @And("^searches for (.+)$")
    public void enterSearchCriteria(String criteria){
        meli.clickAcceptCookiesButton();
        meli.enterSearchCriteria(criteria);
        meli.clickSearch();
    }

    @And("^navigates to the second page$")
    public void navigateToSecondPage(){
        meli.navigateToSecondPage();
    }

    @And("^selects the third item$")
    public void selectsThirdItem(){
        meli.pick3rdItem();
    }

    @Then("^the user is able to add it to the cart$")
    public void itemCanBeAddedToTheCart(){
        meli.addToCart();
        Assert.assertEquals("Agregaste a tu carrito", meli.addedToCartMessage());
    }
    
}
