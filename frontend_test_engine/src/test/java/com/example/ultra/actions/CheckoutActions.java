package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.checkout.CheckoutCompletePage;
import com.example.ultra.pageobjects.checkout.CheckoutStepOnePage;
import com.example.ultra.pageobjects.checkout.CheckoutStepTwoPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CheckoutActions {
    @Autowired
    AtlasService atlasService;

    private CheckoutStepOnePage getCheckoutStepOnePage() {
        return atlasService.get(CheckoutStepOnePage.class).isPageOpened();
    }

    private CheckoutStepTwoPage getCheckoutStepTwoPage() {
        return atlasService.get(CheckoutStepTwoPage.class).isPageOpened();
    }

    private CheckoutCompletePage getCheckoutCompletePage() {
        return atlasService.get(CheckoutCompletePage.class).isPageOpened();
    }

}
