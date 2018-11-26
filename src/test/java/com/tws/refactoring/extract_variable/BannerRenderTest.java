package com.tws.refactoring.extract_variable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;


public class BannerRenderTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void renderBanner() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        bannerRender.renderBanner();
        assertEquals("Window", bannerRender.getPlatform());
    }
    @Test
    public void platformIsMAC() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        assertTrue(bannerRender.platformIsMAC(bannerRender.getPlatform())) ;
    }
    @Test
    public void browserIsIE() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        assertTrue(bannerRender.browserIsIE(bannerRender.getBrowser()));
    }
    @Test
    public void shoePlatform() {
        BannerRender bannerRender = new BannerRender("MAC", "IE");
        bannerRender.showPlatform();
        assertEquals("Window", bannerRender.getPlatform());
    }
}
