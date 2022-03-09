package com.example.ultra.pageobjects;

import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;

public interface SwagLabsSite extends WebSite {
    @Page
    WebPage index();
}
