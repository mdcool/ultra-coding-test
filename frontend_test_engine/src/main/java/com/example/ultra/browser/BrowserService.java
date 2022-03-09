package com.example.ultra.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

@Service
public class BrowserService {

    private final Object LOCK = new Object();
    private ChromeDriver driver;

    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        synchronized (LOCK) {
            if (driver == null)
                driver = new ChromeDriver();
        }
        return driver;
    }

    public void closeBrowser() {
        synchronized (LOCK) {
            if (driver != null) {
                driver.close();
                driver.quit();
            }
        }
    }
}
