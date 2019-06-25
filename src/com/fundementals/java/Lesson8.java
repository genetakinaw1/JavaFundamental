package com.fundementals.java;

/*
* The contents of the class is to build lesson 8
* control flow statements
* */

public class Lesson8 {
// if statement
    public void basicIfExample(int value1, int value2) {

        System.out.println(" Before if statement");
        if (value1 == value2) {
            System.out.println("values are equal");

        }
        System.out.println("After if Statement");

    }
//if and else statetment example
    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if (alpha != beta) {
            System.out.println("The values are not equal");

        } else {
            System.out.println("The values are equal");
        }
        System.out.println("End of if statement");
    }

    public void basicIfElseChainExample(int charlie) {
        System.out.println("Before if statement");
        if (charlie < 30) {
            System.out.println("The value is less than 30");
        } else if (charlie < 40) {
            System.out.println("The value is greater than 30 but less than 40.");
        } else {
            System.out.println("The value is greater than 40");

        }
        System.out.println("End of if statement");
    }

    public void basicIfAndOrExample(int delta) {
        System.out.println("Before if statement");

        if (delta > 100 || delta < 50) {

            System.out.println("The value is not between 100 and 50");
            if (delta % 2 == 0 && delta > 30) {
                System.out.println("The value of is greater than 30 and an even number");
            }


        }

    }// end method

    public void basicSwitchExample(int day) {
        switch (day) {
            case 1:
                System.out.println("day = 1");
                break;
            case 2:
                System.out.println("day = 2");
                break;
            case 3:
            case 4:
                System.out.println("day = 3 or 4");
                break;
            default:
                System.out.println("day is greater than 4.");
                break;
        }

    }//end of method;

    public void basicWhileExample() {
        int val = 0;//initialized value
        while (val < 10) {//expression
            System.out.println(val);
            val++;// increment
        }

    }//end of method

    public void basicDoWhileExample() {
        int today = 0;
        do {

            if (today % 2 == 0) {
                System.out.println(today);

            }
            today++;
        } while (today < 30);

    }//end method

    public void basicForLoopExample() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
    }

    public void basicBranchingExample(){

        for ( int i = 0;i < 10; i++){
            if (i ==2){
                continue;
            }if (i==4){
                System.out.println("Loop breaks");
                break;

            }
            System.out.println(i );

        }
        System.out.println("End of Loop");
    }



}

