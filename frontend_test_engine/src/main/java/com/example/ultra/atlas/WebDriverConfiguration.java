package com.example.ultra.atlas;

import io.qameta.atlas.core.context.RetryerContext;
import io.qameta.atlas.core.internal.EmptyRetryer;
import io.qameta.atlas.webdriver.context.WebDriverContext;
import io.qameta.atlas.core.internal.Configuration;
import io.qameta.atlas.webdriver.extension.ExtractMethodExtension;
import io.qameta.atlas.webdriver.extension.DriverProviderExtension;
import io.qameta.atlas.webdriver.extension.ExecuteJScriptMethodExtension;
import io.qameta.atlas.webdriver.extension.FilterCollectionExtension;
import io.qameta.atlas.webdriver.extension.FindByCollectionExtension;
import io.qameta.atlas.webdriver.extension.FindByExtension;
import io.qameta.atlas.webdriver.extension.PageExtension;
import io.qameta.atlas.webdriver.extension.ShouldMethodExtension;
import io.qameta.atlas.webdriver.extension.ToStringMethodExtension;
import io.qameta.atlas.webdriver.extension.WaitUntilMethodExtension;
import io.qameta.atlas.webdriver.extension.WrappedElementMethodExtension;
import org.openqa.selenium.WebDriver;

/**
 * WebDriver configuration.
 */
@SuppressWarnings("checkstyle:ClassDataAbstractionCoupling")
public class WebDriverConfiguration extends Configuration {

    public WebDriverConfiguration(final WebDriver webDriver) {
        registerContext(new WebDriverContext(webDriver));
        registerContext(new RetryerContext(new EmptyRetryer()));
        registerExtension(new DriverProviderExtension());
        registerExtension(new DefaultMethodExtension());
        registerExtension(new FindByExtension());
        registerExtension(new FindByCollectionExtension());
        registerExtension(new ShouldMethodExtension());
        registerExtension(new WaitUntilMethodExtension());
        registerExtension(new WrappedElementMethodExtension());
        registerExtension(new ExecuteJScriptMethodExtension());
        registerExtension(new PageExtension());
        registerExtension(new FilterCollectionExtension());
        registerExtension(new ToStringMethodExtension());
        registerExtension(new ExtractMethodExtension());
    }

    public WebDriverConfiguration(final WebDriver webDriver, final String baseUrl) {
        this(webDriver);
        System.getProperties().setProperty("ATLAS_WEBSITE_URL", baseUrl);
    }
}
