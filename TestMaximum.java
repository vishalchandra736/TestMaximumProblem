package com.blz.generices;

public class TestMaximum {
    public static void main(String[] args) {
        Integer firstNum = 11;
        Integer secondNum = 321;
        Integer thirdNum = 111;
        System.out.println("Maximum among three integer");
        TestMaximum testMaximum = new TestMaximum();
        testMaximum.findMax(firstNum, secondNum, thirdNum);
    }

    private void findMax(Integer firstNum, Integer secondNum, Integer thirdNum) {
        Integer maxNum;
        if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0) {
            maxNum = firstNum;
        } else if (secondNum.compareTo(thirdNum) > 0) {
            maxNum = secondNum;
        } else {
            maxNum = thirdNum;
        }
        System.out.println("Maximum integer is " + maxNum + " among " + firstNum + ", " + secondNum + ", " + thirdNum);
    }
}
