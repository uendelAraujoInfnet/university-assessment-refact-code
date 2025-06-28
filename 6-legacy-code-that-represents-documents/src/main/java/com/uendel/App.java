package com.uendel;

public class App {
    public static void main (String[] args) {
        Document pdf = new PdfDocument();
        Document html = new HtmlDocument();
        Document text = new TextDocument();

        pdf.print();
        html.print();
        text.print();
    }
}
