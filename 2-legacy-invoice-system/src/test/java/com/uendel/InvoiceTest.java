package com.uendel;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceTest {

    @Test
    void shouldCreateSimpleInvoice() {
        Invoice invoice = new Invoice("Ana", "ana@email.com", 100.0, 1);
        assertThat(invoice.getType()).isEqualTo(InvoiceType.SIMPLES);
        assertThat(invoice.getAmount()).isEqualTo(100.0);
        assertThat(invoice.getClientName()).isEqualTo("Ana");
    }

    @Test
    void shouldCreateInvoiceWithTax(){
        Invoice invoice = new Invoice("Carlos", "carlos@email.com", 250.0, 2);
        assertThat(invoice.getType().getDescricao()).isEqualTo("Com imposto");
    }

    @Test
    void shouldIdentifyUnknownInvoiceType() {
        Invoice invoice = new Invoice("Beto", "beto@email.com", 80.0, 999);
        assertThat(invoice.getType()).isEqualTo(InvoiceType.DESCONHECIDO);
    }

    @Test
    void shouldRejectInvalidEmail() {
        Invoice invoice = new Invoice("Lucas", "lucas#email.com", 120.0, 1);
        assertThat(invoice.isValidEmail()).isFalse();
    }

    @Test
    void shouldAcceptValidEmail() {
        Invoice invoice = new Invoice("Lucas", "lucas@email.com", 120.0, 1);
        assertThat(invoice.isValidEmail()).isTrue();
    }
}
