package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.dto.Cart;
import com.example.ultra.dto.Product;
import com.example.ultra.execution.Key;
import com.example.ultra.execution.ScenarioContext;
import com.example.ultra.pageobjects.inventory.InventoryPage;
import com.example.ultra.pageobjects.inventory.components.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hamcrest.Matchers.equalTo;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;

@Component
public class InventoryActions {
    @Autowired
    AtlasService atlasService;
    @Autowired
    ScenarioContext scenarioContext;

    public void inventoryPageIsOpened() {
        getInventoryPage();
    }

    private InventoryPage getInventoryPage() {
        return atlasService.get(InventoryPage.class).isPageOpened();
    }

    public void addAProductToCart() {
        InventoryPage inventoryPage = getInventoryPage();
        InventoryItem inventoryItem = inventoryPage.inventoryItems().randomItem();
        Product product = new Product()
                .withName(inventoryItem.name().getText())
                .withDescription(inventoryItem.description().getText())
                .withPrice(inventoryItem.price().getText())
                .withQuantity(1);
        inventoryItem.addToCartButton().click();
        Cart cart = new Cart();
        cart.products.put(product, 1);
        scenarioContext.save(Key.CART, cart);
        inventoryPage.shoppingCartBadge().should(displayed()).should(text(equalTo("1")));
    }
}
