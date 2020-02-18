package com.jiker.keju.taxicost;

import java.math.BigDecimal;

public class RangeCalculation {
    private static final BigDecimal TWO = new BigDecimal("2");
    private static final BigDecimal SIX = new BigDecimal("6");
    private static final BigDecimal EIGHT = new BigDecimal("8");
    private static final BigDecimal TARIFF_ONE_LEVEL = new BigDecimal("6");
    private static final BigDecimal TARIFF_TWO_LEVEL = new BigDecimal("0.8");
    private static final BigDecimal TARIFF_THREE_LEVEL = new BigDecimal("1.5");

    public BigDecimal calculation(BigDecimal range) {
        // 不大于2公里时只收起步价6元。
        // 超过2公里的部分每公里收取0.8元。
        // 超过8公里的部分，每公里加收50%长途费
        BigDecimal total = BigDecimal.ZERO.add(threeLevel(range)).add(twoLevel(range)).add(oneLevel(range));
        return total;
    }

    private BigDecimal oneLevel(BigDecimal range) {
        if (range.compareTo(BigDecimal.ZERO) > 0) {
            return TARIFF_ONE_LEVEL;
        }
        return BigDecimal.ZERO;
    }

    private BigDecimal twoLevel(BigDecimal range) {
        if (range.compareTo(EIGHT) > 0) {
            return SIX.multiply(TARIFF_TWO_LEVEL).setScale(1);
        } else if (range.compareTo(TWO) > 0) {
            return (range.subtract(TWO)).multiply(TARIFF_TWO_LEVEL).setScale(1);
        }
        return BigDecimal.ZERO;
    }

    private BigDecimal threeLevel(BigDecimal range) {
        if (range.compareTo(EIGHT) > 0) {
            return (range.subtract(EIGHT)).multiply(TARIFF_TWO_LEVEL.multiply(TARIFF_THREE_LEVEL).setScale(1));
        }
        return BigDecimal.ZERO;
    }
}
