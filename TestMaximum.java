package com.blz.generices;

public class TestMaximum {
    public static void main(String[] args) {
        String firstString = "Apple";
        String secondString = "Peach";
        String thirdString = "Banana";
        System.out.println("Maximum among three strings");
        TestMaximum testMaximum = new TestMaximum();
        testMaximum.findMax(firstString, secondString, thirdString);
    }

    private void findMax(String firstString, String secondString, String thirdString) {
        String maxString;
        if (firstString.compareTo(secondString) > 0 && firstString.compareTo(thirdString) > 0) {
            maxString = firstString;
        } else if (secondString.compareTo(thirdString) > 0) {
            maxString = secondString;
        } else {
            maxString = thirdString;
        }
        System.out.println("Maximum float is " + maxString + " among " + firstString + ", " + secondString + ", " + thirdString);
    }
}
