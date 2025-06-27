package com.uendel;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PriceCalculatorTest {

    private final PriceCalculator calculator = new PriceCalculator();

    @Test
    void shouldApplyRegularDiscount() {
        double finalPrice = calculator.calculateFinalPrice(100.0, CustomerType.REGULAR, false);
        assertThat(finalPrice).isEqualTo(90.0);
    }

    @Test
    void shouldApplyVipDiscount() {
        double finalPrice = calculator.calculateFinalPrice(200.0, CustomerType.VIP, false);
        assertThat(finalPrice).isEqualTo(170.0);
    }

    @Test
    void shouldApplyGuestNoDiscount() {
        double finalPrice = calculator.calculateFinalPrice(150.0, CustomerType.GUEST, false);
        assertThat(finalPrice).isEqualTo(150.0);
    }

    @Test
    void shouldApplyHolidayBonusForRegularCustomer() {
        double finalPrice = calculator.calculateFinalPrice(100.0, CustomerType.REGULAR, true);
        assertThat(finalPrice).isEqualTo(85.0);
    }

    @Test
    void shouldApplyHolidayBonusForVipCustomer() {
        double finalPrice = calculator.calculateFinalPrice(100.0, CustomerType.VIP, true);
        assertThat(finalPrice).isEqualTo(80.0);
    }

    @Test
    void shouldApplyOnlyHolidayBonusForGuest() {
        double finalPrice = calculator.calculateFinalPrice(100.0, CustomerType.GUEST, true);
        assertThat(finalPrice).isEqualTo(95.0);
    }
}

