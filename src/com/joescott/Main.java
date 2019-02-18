package com.joescott;

public class Main {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        byte myByte = 10;

        // 2. Create a short variable and set it to any valid short number.
        short myShort = 20;

        // 3. Create a int variable and set it to any valid int number.
        int myInt = 50;

        // 4. Create a variable of type long, and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short plus the int
        long longTotal = 50000 + 10 * (myByte + myShort + myInt);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);


    }
}
