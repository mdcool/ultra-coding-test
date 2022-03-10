package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.common.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonActions {
    @Autowired
    AtlasService atlasService;

    private BasePage getBasePage() {
        return atlasService.get(BasePage.class);
    }

    public void goToCart() {
        BasePage basePage = getBasePage();
        basePage.shoppingCartLink().click();
    }
}
