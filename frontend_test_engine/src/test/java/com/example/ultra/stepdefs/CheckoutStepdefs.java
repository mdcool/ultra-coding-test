package com.example.ultra.stepdefs;

import com.example.ultra.actions.CartActions;
import com.example.ultra.actions.CheckoutActions;
import com.example.ultra.actions.CommonActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckoutStepdefs {
    @Autowired
    CommonActions commonActions;
    @Autowired
    CartActions cartActions;
    @Autowired
    CheckoutActions checkoutActions;

    @When("user proceeds with checkout")
    public void userProceedsWithCheckout() {
        commonActions.goToCart();
        cartActions.goToCheckout();
        checkoutActions.populateShippingDetails();
        checkoutActions.continueToStepTwo();
        checkoutActions.verifyCartProducts();
        checkoutActions.finishCheckout();
    }

    @Then("user is able to place the order")
    public void userIsAbleToPlaceTheOrder() {
        checkoutActions.verifyOrderSuccessful();
    }
}
