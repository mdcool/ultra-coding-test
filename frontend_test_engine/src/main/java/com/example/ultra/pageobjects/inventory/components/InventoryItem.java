package com.example.ultra.pageobjects.inventory.components;

import com.example.ultra.pageobjects.common.BaseElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface InventoryItem extends BaseElement {
    @FindBy(".//div[@class = 'inventory_item_img']")
    BaseElement image();

    @FindBy(".//div[@class = 'inventory_item_name']")
    BaseElement name();

    @FindBy(".//div[@class = 'inventory_item_desc']")
    BaseElement description();

    @FindBy(".//div[@class = 'inventory_item_price']")
    BaseElement price();

    @FindBy(".//button[contains(@class, 'add-to-cart')]")
    BaseElement addToCartButton();
}
