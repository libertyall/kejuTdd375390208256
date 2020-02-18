package com.jiker.keju.taxicost;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ParkCalculationTest {

    @Test
    public void calculationTest() {
        ParkCalculation calc = new ParkCalculation();
        assertEquals(new BigDecimal("0.00"), calc.calculation(new BigDecimal("0")));
        assertEquals(new BigDecimal("0.25"), calc.calculation(new BigDecimal("1")));
        assertEquals(new BigDecimal("0.50"), calc.calculation(new BigDecimal("2")));
        assertEquals(new BigDecimal("0.75"), calc.calculation(new BigDecimal("3")));
        assertEquals(new BigDecimal("2.50"), calc.calculation(new BigDecimal("10")));
    }
}
