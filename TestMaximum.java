package com.blz.generices;

public class TestMaximum {
    public static void main(String[] args) {
        Float firstNum = 11.4F;
        Float secondNum = 122.7F;
        Float thirdNum = 311.1F;
        System.out.println("Maximum among three float");
        TestMaximum testMaximum = new TestMaximum();
        testMaximum.findMax(firstNum, secondNum, thirdNum);
    }

    private void findMax(Float firstNum, Float secondNum, Float thirdNum) {
        Float maxNum;
        if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0) {
            maxNum = firstNum;
        } else if (secondNum.compareTo(thirdNum) > 0) {
            maxNum = secondNum;
        } else {
            maxNum = thirdNum;
        }
        System.out.println("Maximum float is " + maxNum + " among " + firstNum + ", " + secondNum + ", " + thirdNum);
    }
}
