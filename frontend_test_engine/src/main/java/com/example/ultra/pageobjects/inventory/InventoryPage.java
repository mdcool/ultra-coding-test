package com.example.ultra.pageobjects.inventory;

import com.example.ultra.pageobjects.common.BaseCollection;
import com.example.ultra.pageobjects.common.BaseElement;
import com.example.ultra.pageobjects.common.BasePage;
import com.example.ultra.pageobjects.inventory.components.InventoryItem;
import io.qameta.atlas.webdriver.extension.FindBy;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public interface InventoryPage extends BasePage {
    @FindBy("//div[@id = 'inventory_container']")
    BaseElement inventoryContainer();

    @FindBy("//div[@id = 'inventory_container']//div[@class = 'inventory_item']")
    BaseCollection<InventoryItem> inventoryItems();

    @Override
    default InventoryPage isPageOpened() {
        inventoryContainer().should(displayed());
        return this;
    }
}
