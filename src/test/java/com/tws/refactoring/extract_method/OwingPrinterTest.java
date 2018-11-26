package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OwingPrinterTest {
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
    public void printBanner() {
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printBanner();
        assertEquals("*****************************\r\n"
                + "****** Customer totals ******\r\n"
                + "*****************************\r\n", outContent.toString());
    }
     @Test
    public void calOutstanding() {
        OwingPrinter owingPrinter = new OwingPrinter();
    }
     @Test
    public void printDetails() {
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printDetails("aaaa", 555.0);
        assertEquals("name: aaaa\r\n" + "amount: 555.0\r\n", outContent.toString());
    }
}