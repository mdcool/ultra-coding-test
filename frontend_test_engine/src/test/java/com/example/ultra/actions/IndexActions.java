package com.example.ultra.actions;

import com.example.ultra.atlas.AtlasService;
import com.example.ultra.pageobjects.SwagLabsSite;
import com.example.ultra.pageobjects.index.IndexPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IndexActions {
    @Autowired
    AtlasService atlasService;
    @Value("${website.username}")
    String userName;
    @Value("${website.password}")
    String userPassword;

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
        indexPage.userNameInput().sendKeys(userName);
        indexPage.passwordInput().sendKeys(userPassword);
    }

    public void pressLoginButton() {
        IndexPage indexPage = getIndexPage();
        indexPage.loginButton().click();
    }
}
