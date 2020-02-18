package com.jiker.keju.taxicost;

import java.math.BigDecimal;

public class Taxicost {
    public TaxiTotal calculation(TaxiTotal taxiTotal) {
        RangeCalculation rangeCalc = new RangeCalculation();
        ParkCalculation parkCalc = new ParkCalculation();
        BigDecimal sum = rangeCalc.calculation(taxiTotal.getRange()).add(parkCalc.calculation(taxiTotal.getParkTime()));
        taxiTotal.setTotal(sum.setScale(0, BigDecimal.ROUND_HALF_UP));
        return taxiTotal;
    }
}
