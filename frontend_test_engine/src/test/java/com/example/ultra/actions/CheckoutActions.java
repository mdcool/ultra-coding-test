package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.dto.Cart;
import com.example.ultra.execution.Key;
import com.example.ultra.execution.ScenarioContext;
import com.example.ultra.pageobjects.checkout.CheckoutCompletePage;
import com.example.ultra.pageobjects.checkout.CheckoutStepOnePage;
import com.example.ultra.pageobjects.checkout.CheckoutStepTwoPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

@Component
public class CheckoutActions {
    @Autowired
    AtlasService atlasService;
    @Autowired
    ScenarioContext scenarioContext;

    private CheckoutStepOnePage getCheckoutStepOnePage() {
        return atlasService.get(CheckoutStepOnePage.class).isPageOpened();
    }

    private CheckoutStepTwoPage getCheckoutStepTwoPage() {
        return atlasService.get(CheckoutStepTwoPage.class).isPageOpened();
    }

    private CheckoutCompletePage getCheckoutCompletePage() {
        return atlasService.get(CheckoutCompletePage.class).isPageOpened();
    }

    public void populateShippingDetails() {
        CheckoutStepOnePage page = getCheckoutStepOnePage();
        page.firstNameInput().sendKeys("blabla"); // TODO: 10.03.2022 randomize
        page.lastNameInput().sendKeys("blabla"); // TODO: 10.03.2022 randomize
        page.zipCodeInput().sendKeys("12345"); // TODO: 10.03.2022 randomize
    }

    public void continueToStepTwo() {
        getCheckoutStepOnePage().continueButton().click();
    }

    public void verifyCartProducts() {
        CheckoutStepTwoPage page = getCheckoutStepTwoPage();
        Cart cart = scenarioContext.get(Key.CART, Cart.class);
        page.cartItems().should(hasSize(cart.products.size()));
    }

    public void finishCheckout() {
        getCheckoutStepTwoPage().finishButton().click();
    }

    public void verifyOrderSuccessful() {
        CheckoutCompletePage page = getCheckoutCompletePage();
        page.completeHeader().should(displayed());
        page.shoppingCartBadge().should(not(displayed()));
    }
}
