package com.fundementals.java;

public class Demo {
    //This is the main entry point of the java program
    public static void main(String args[]) {
        //initializing a variable
        int i = 5;
        //displaying the variable
        System.out.println("The value of i is" + i);
        i = i + 1;
        System.out.println("The value of i is" + 1);

    }

    public static void moreDemo() {


        short i = 5;
        short j = -6;
        System.out.println("The value of i is" + i);
        System.out.println("The value of j is" + j);
    }

    public static void moreDemo1() {
        long k = 10000000;
        long j = -45000000;
        System.out.println("The value of i is" + k);
        System.out.println("The value of j is " + j);


        float s = 10.11F;
        float z = -45.44F;
        System.out.println("The value of s is " + s);
        System.out.println("The value of j is " + z);

        double m = 10.11111111;
        double n = -45.4444444;
        System.out.println("The value of i is " + m);
        System.out.println("The value of n is " + n);


        int x = 3;
        int c = 4;
        System.out.println("The sum of the numbers is " + (x + c));

    }

    public void addNumbers(int nm, int mz) {
        nm = 3;
        mz = 4;
        System.out.println("The sum of the numbers is " + (nm + mz));
    }

    public void concatenation() {

        String str1 = ("Today is ");
        str1 = str1.concat("a special Friday. ");
        str1 = str1.concat("Because we have pizza party ");
        str1 = str1.concat("with our instructor Odell ");
        String str2 = ("FEC");
        char cc1 = '\u0040';
        System.out.println(str1 + cc1 + str2);

    }

    public void exampleEscape() {

        System.out.println("Today is a special friday!.\n Beause we have a pizza party with our insturctor Odell!\n @FEC ");


    }
}