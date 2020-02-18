package com.jiker.keju.taxicost;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RangeCalculationTest {

    @Test
    public void calculationTest() {
        RangeCalculation calc = new RangeCalculation();
        assertEquals(new BigDecimal("0"), calc.calculation(new BigDecimal("0")));
        assertEquals(new BigDecimal("6"), calc.calculation(new BigDecimal("1")));
        assertEquals(new BigDecimal("6"), calc.calculation(new BigDecimal("2")));
        assertEquals(new BigDecimal("6.8"), calc.calculation(new BigDecimal("3")));
        assertEquals(new BigDecimal("13.2"), calc.calculation(new BigDecimal("10")));
    }

}
