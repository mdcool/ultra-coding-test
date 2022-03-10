package com.example.ultra.pageobjects.common.components;

import com.example.ultra.pageobjects.common.BaseElement;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import org.openqa.selenium.WebElement;

public interface CartItem extends AtlasWebElement<WebElement> {
    @FindBy(".//div[@class = 'cart_quantity']")
    BaseElement quantity();

    @FindBy(".//div[@class = 'inventory_item_name']")
    BaseElement name();

    @FindBy(".//div[@class = 'inventory_item_desc']")
    BaseElement description();

    @FindBy(".//button[contains(@class, 'remove')]")
    BaseElement removeButton();
}
