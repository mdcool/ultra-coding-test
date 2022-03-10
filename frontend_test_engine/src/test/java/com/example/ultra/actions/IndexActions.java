package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.SwagLabsSite;
import com.example.ultra.pageobjects.index.IndexPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexActions {
    @Autowired
    AtlasService atlasService;

    public void websiteIsOpen() {
        IndexPage indexPage = atlasService.get(SwagLabsSite.class).index();
        indexPage.open();
        indexPage.isPageOpened();
    }

    private IndexPage getIndexPage() {
        return atlasService.get(IndexPage.class).isPageOpened();
    }

    public void enterCredentials() {
        IndexPage indexPage = getIndexPage();
        indexPage.userNameInput().sendKeys("standard_user");
        indexPage.passwordInput().sendKeys("secret_sauce");
    }

    public void pressLoginButton() {
        IndexPage indexPage = getIndexPage();
        indexPage.loginButton().click();
    }
}
