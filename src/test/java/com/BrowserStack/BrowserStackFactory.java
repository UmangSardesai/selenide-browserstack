package com.BrowserStack;

import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.codeborne.selenide.WebDriverProvider;

public class BrowserStackFactory implements WebDriverProvider {
    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "IE");
    caps.setCapability("browser_version", "7.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "XP");
    caps.setCapability("build", "Sample Selenide Tests");
    caps.setCapability("browserstack.debug", "true");

    String URL = "http://<username>:<automate-key>@hub.browserstack.com/wd/hub";

    try{return new RemoteWebDriver(new URL(URL), caps);}
    catch (Exception e) {return null;}
    }
  }