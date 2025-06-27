package com.uendel;

public enum CustomerType {
    REGULAR(0.10),
    VIP(0.15),
    GUEST(0.0);

    private final double discountRate;

    CustomerType(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
