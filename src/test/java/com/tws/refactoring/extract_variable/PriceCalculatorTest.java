package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;


public class PriceCalculatorTest {
    @Test
    public void get_normal_price(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(4,5);
        assertEquals(22.0, result,0.001);
    }

    @Test
    public void get_price_quantity_larger_than_500(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double result = priceCalculator.getPrice(650,10);
        assertEquals(6525, result,0.001);
    }
}
