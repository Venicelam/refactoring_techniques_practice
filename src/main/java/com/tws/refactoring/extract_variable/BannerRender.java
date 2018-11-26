package com.tws.refactoring.extract_variable;

public class BannerRender {
    private String browser;
    private String platform;

    public String getBrowser() {
        return browser;
    }
    public String getPlatform() {
        return platform;
    }
    public BannerRender(String platform, String browser){
        this.platform = platform;
        this.browser = browser;
    }
    public void renderBanner() {
        if (platformIsMAC(platform) && browserIsIE(browser)) {
            showPlatform();
        }
    }
    boolean platformIsMAC(String platform){
        return platform.toUpperCase().contains("MAC");
    }
    boolean browserIsIE(String browser){
        return browser.toUpperCase().contains("IE");
    }
    void showPlatform(){
        this.platform = "Window";
    }
    }

