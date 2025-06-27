package com.uendel;

public class Classifier {

    public void classify() {}

    public void classify(int value) {
        printDebug(value);
        String result = determineLevel(value);
        System.out.println(result);
    }

    protected String determineLevel(int value) {
        if (value == -9999) return "RARE CASE";
        if (value > 10) return "HIGH CASE";
        if (value  == 10) return "MEDIUM CASE";
        return "LOW CASE";
    }

    private void printDebug(int value) {
        System.out.println("DEBUG: value = " + value);
    }
}
