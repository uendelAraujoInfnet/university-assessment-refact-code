package com.uendel;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassifierTest {

    private final Classifier classifier = new Classifier();

    @Test
    void shouldClassifyAsHigh(){
        assertThat(classifier.determineLevel(15)).isEqualTo("HIGH CASE");
    }

    @Test
    void shouldClassifyAsMedium(){
        assertThat(classifier.determineLevel(10)).isEqualTo("MEDIUM CASE");
    }

    @Test
    void shouldClassifyAsRareCase(){
        assertThat(classifier.determineLevel(-9999)).isEqualTo("RARE CASE");
    }

    @Test
    void shouldClassifyAsLow(){
        assertThat(classifier.determineLevel(3)).isEqualTo("LOW CASE");
    }

    @Test
    void shouldClassifyZeroAsLow() {
        assertThat(classifier.determineLevel(0)).isEqualTo("LOW CASE");
    }

    @Test
    void shouldClassifyNegativeGenericAsLow() {
        assertThat(classifier.determineLevel(-8)).isEqualTo("LOW CASE");
    }

    @Test
    void shouldClassifyLargeNumberAsHigh() {
        assertThat(classifier.determineLevel(1000)).isEqualTo("HIGH CASE");
    }

    @Test
    void shouldClassifyElevenAsHigh() {
        assertThat(classifier.determineLevel(11)).isEqualTo("HIGH CASE");
    }
}
