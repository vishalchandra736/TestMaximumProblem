package com.blz.generices;

import java.util.ArrayList;
import java.util.Collections;

public class TestMaximum <T extends Comparable <T>>{
    T varOne;
    T varTwo;
    T varThree;
    T varFour;
    T varFive;
    public TestMaximum(T varOne, T varTwo, T varThree, T varFour, T varFive) {
        super();
        this.varOne = varOne;
        this.varTwo = varTwo;
        this.varThree = varThree;
        this.varFour = varFour;
        this.varFive = varFive;
    }
    public void findMax() {
        TestMaximum.max(this.varOne, this.varTwo, this.varThree, this.varFour, this.varFive);
    }
    public static <E> void printMax(E max, ArrayList<E> list ) {
        System.out.println(max + " is maximum among " + list);
    }
    public static void main(String[] args) {
        Integer fNum = 11;
        Integer sNum = 21;
        Integer tNum = 31;
        Integer num4 = 41;
        Integer num5 = 51;
        Float fNumFloat = 11.1F;
        Float sNumFloat = 21.1F;
        Float tNumFloat = 31.1F;
        Float numF4 = 41.1F;
        Float numF5 = 51.1F;
        String fString = "Apple";
        String sString = "Peach";
        String tString = "Banana";
        String string4 = "Mango";
        String string5 = "PineApple";
        System.out.println("***** Test Maximum among three ***** ");
        max(fNum, sNum, tNum, num4, num5);
        max(fNumFloat, sNumFloat, tNumFloat, numF4, numF5 );
        max(fString, sString, tString, string4, string5);
    }
    public static <E extends Comparable<E>> void max(E firstVar, E secondVar, E thirdVar, E fourthVar, E fifthVar) {
        ArrayList <E> varList = new ArrayList<>();
        varList.add(firstVar);
        varList.add(secondVar);
        varList.add(thirdVar);
        varList.add(fourthVar);
        varList.add(fifthVar);
        printMax(Collections.max(varList), varList);
    }
}
