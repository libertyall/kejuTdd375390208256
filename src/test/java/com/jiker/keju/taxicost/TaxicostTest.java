package com.jiker.keju.taxicost;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxicostTest {
    @Test
    public void calculation1Test() {
        Taxicost taxicost = new Taxicost();
        TaxiTotal taxiTotal = new TaxiTotal(new BigDecimal("1"), BigDecimal.ZERO);
        TaxiTotal taxiTotalled = taxicost.calculation(taxiTotal);
        assertEquals(new BigDecimal("6"), taxiTotalled.getTotal());
    }

    @Test
    public void calculation2Test() {
        Taxicost taxicost = new Taxicost();
        TaxiTotal taxiTotal = new TaxiTotal(new BigDecimal("3"), BigDecimal.ZERO);
        TaxiTotal taxiTotalled = taxicost.calculation(taxiTotal);
        assertEquals(new BigDecimal("7"), taxiTotalled.getTotal());
    }

    @Test
    public void calculation3Test() {
        Taxicost taxicost = new Taxicost();
        TaxiTotal taxiTotal = new TaxiTotal(new BigDecimal("10"), BigDecimal.ZERO);
        TaxiTotal taxiTotalled = taxicost.calculation(taxiTotal);
        assertEquals(new BigDecimal("13"), taxiTotalled.getTotal());
    }

    @Test
    public void calculation4Test() {
        Taxicost taxicost = new Taxicost();
        TaxiTotal taxiTotal = new TaxiTotal(new BigDecimal("2"), new BigDecimal("3"));
        TaxiTotal taxiTotalled = taxicost.calculation(taxiTotal);
        assertEquals(new BigDecimal("7"), taxiTotalled.getTotal());
    }
}
