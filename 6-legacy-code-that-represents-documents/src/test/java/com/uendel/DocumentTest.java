package com.uendel;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class DocumentTest {

    private String captureOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        action.run();
        System.setOut(System.out);
        return outputStream.toString().trim();
    }

    @Test
    void shouldPrintPdfDocument() {
        Document pdf = new PdfDocument();
        String output = captureOutput(() -> pdf.print());
        assertThat(output).isEqualTo("Printing PDF document");
    }

    @Test
    void shouldPrintHtmlDocument() {
        Document html = new HtmlDocument();
        String output = captureOutput(() -> html.print());
        assertThat(output).isEqualTo("Printing HTML");
    }

    @Test
    void shouldPrintTextDocument() {
        Document txt = new TextDocument();
        String output = captureOutput(() -> txt.print());
        assertThat(output).isEqualTo("Printing TEXT");
    }
}

