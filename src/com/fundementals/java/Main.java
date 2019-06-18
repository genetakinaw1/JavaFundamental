package com.fundementals.java;
/*
*This class is the starting class of this project
* This is an example of a multiple comment.
 */
public class Main {

    public static void main(String[] args) {

        lesson5Examples();
        //houseExample();

    }

    public static void lesson5Examples(){

     Lesson5 mylesson5= new Lesson5();
        mylesson5.showLocalExample();
        mylesson5.showLocalWithParameter(10,12);
        int example= mylesson5.showLocalWithReturn(15,8);
        System.out.println(example);
        mylesson5.showInstanceVariable();
        mylesson5.showConversions();
    }

    public static void houseExample() {
        System.out.println("Welcome to Java");
        House myHouse = new House();
        myHouse.doorOpenClose();
    }
}
