package com.jiker.keju.taxicost;

import java.math.BigDecimal;

public class TaxiTotal {

    private BigDecimal range = BigDecimal.ZERO;

    private BigDecimal parkTime = BigDecimal.ZERO;

    private BigDecimal total = BigDecimal.ZERO;

    public TaxiTotal(BigDecimal range, BigDecimal parkTime) {
        this.range = range;
        this.parkTime = parkTime;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public BigDecimal getRange() {
        return range;
    }

    public BigDecimal getParkTime() {
        return parkTime;
    }

}
