package com.uendel;

public class Invoice {
    private String clientName;
    private String clientEmail;
    private double amount;
    private InvoiceType type;

    public Invoice(String clientName, String clientEmail, double amount, int typeCode) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.amount = amount;
        this.type = InvoiceType.fromInt(typeCode);
    }

    public boolean isValidEmail(){
        return clientEmail != null && clientEmail.contains("@");
    }

    public String generateNoteContent(){
        return String.format("""
            --- NOTA FISCAL ---
            Cliente: %s
            Valor: R$ %.2f
            Tipo: %s
            ---------------------
            """, clientName, amount, type.getDescricao());
    }

    public void process(EmailService emailService){
        if(!isValidEmail()){
            System.out.println("Invalid email. Falha no envio.");
            return;
        }

        System.out.println(generateNoteContent());
        emailService.send(clientEmail, generateNoteContent());
    }

    public InvoiceType getType() {
        return type;
    }

    public String getClientName() {
        return clientName;
    }

    public double getAmount() {
        return amount;
    }
}
