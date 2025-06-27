package com.uendel;

public enum InvoiceType {
    SIMPLES("Simples"),
    COM_IMPOSTO("Com imposto"),
    DESCONHECIDO("Desconhecido");

    private final String descricao;

    InvoiceType(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static InvoiceType fromInt(int code){
        return switch (code) {
            case 1 -> SIMPLES;
            case 2 -> COM_IMPOSTO;
            default -> DESCONHECIDO;
        };
    }
}
