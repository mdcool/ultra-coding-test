package com.example.ultra.pageobjects.inventory;

import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.inventory.components.InventoryItem;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface InventoryPage extends WebPage {
    @FindBy("//div[@id = 'inventory_container']")
    BaseElement inventoryContainer();

    @FindBy("//div[@id = 'inventory_container']//div[@class = 'inventory_item']")
    ElementsCollection<InventoryItem> inventoryItems();
}
