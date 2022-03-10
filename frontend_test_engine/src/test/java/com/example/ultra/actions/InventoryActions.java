package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.inventory.InventoryPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.Matchers.equalTo;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@Component
public class InventoryActions {
    @Autowired
    AtlasService atlasService;

    public void inventoryPageIsOpened() {
        getInventoryPage();
    }

    private InventoryPage getInventoryPage() {
        return atlasService.get(InventoryPage.class).isPageOpened();
    }

    public void addAProductToCart() {
        InventoryPage inventoryPage = getInventoryPage();
        inventoryPage.inventoryItems().randomItem().addToCartButton().click();
        // TODO: 10.03.2022 cache the product for future validations
        inventoryPage.shoppingCartBadge().should(displayed()).should(text(equalTo("1")));
    }
}
