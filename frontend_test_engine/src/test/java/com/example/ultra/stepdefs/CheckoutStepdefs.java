package com.example.ultra.stepdefs;

import com.example.ultra.actions.CartActions;
import com.example.ultra.actions.CommonActions;
import com.example.ultra.actions.InventoryActions;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckoutStepdefs {
    @Autowired
    CommonActions commonActions;
    @Autowired
    CartActions cartActions;

    @When("user proceeds with checkout")
    public void userProceedsWithCheckout() {
        commonActions.goToCart();
        cartActions.goToCheckout();

    }
}
