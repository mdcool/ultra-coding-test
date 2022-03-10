package com.example.ultra.pageobjects;

import com.example.ultra.pageobjects.index.IndexPage;
import com.example.ultra.pageobjects.inventory.InventoryPage;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;

public interface SwagLabsSite extends WebSite {
    @Page
    IndexPage index();

    @Page(url = "/inventory")
    InventoryPage inventory();
}
