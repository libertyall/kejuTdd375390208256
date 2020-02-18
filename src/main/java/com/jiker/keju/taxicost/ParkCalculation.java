package com.jiker.keju.taxicost;

import java.math.BigDecimal;

public class ParkCalculation {
    private static final BigDecimal TARIFF_ONE_LEVEL = new BigDecimal("0.25");

    public BigDecimal calculation(BigDecimal times) {
        return times.multiply(TARIFF_ONE_LEVEL).setScale(2);
    }
}
