package com.uendel;

public class PriceCalculator {

    public double calculateFinalPrice(double basePrice, CustomerType customerType, boolean isHoliday) {
        double discountRate = getTotalDiscount(customerType, isHoliday);
        return basePrice * (1 - discountRate);
    }

    private double getTotalDiscount(CustomerType customerType, boolean isHoliday) {
        double customerDiscount = customerType.getDiscountRate();
        double holidayBonus = isHoliday ? 0.05 : 0.0;
        return customerDiscount + holidayBonus;
    }
}
