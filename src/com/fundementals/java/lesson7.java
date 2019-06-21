package com.fundementals.java;
import java.util.Scanner;

/*
* The content of this class goes over the Lesson 7 contents.
* The title of the slide deck is Java operator.
* */

public class lesson7 {

    int value1 = 23, value2 = 45;
// code for basic math
    public void basicMath() {

        int addtotal = value1 + value2;
        int subtractTotal = value2 - value1;
        int multiplyTotal = value1 * value2;
        int divisionTotal = value1 / value2;
        System.out.println(addtotal);
        System.out.println(subtractTotal);
        System.out.println(multiplyTotal);
        System.out.println(divisionTotal);
    }
// method for madulus
    public void exampleMadulus() {
        int modulusTotal = value1 % value2;
        System.out.println(modulusTotal);

    }
// method for add arithemtic operation
    public void addTwoNumbers(){
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("The sum of entered values= "+z);
    }
// method for Assignment operator
    public void exampleAssignmetn1(){

        int able = 10, may = 15;
        able += may;
        System.out.println(able);
        may -= able;
        System.out.println(may);
        able *= may;
        System.out.println(able);
        able /= may;
        System.out.println(able);
        may %= able;
        System.out.println(may);

    }
    //method for more assignment operator
    public void exampleAssignment2(){
        int beta =10, charlie =5;
        beta <<=charlie;
        System.out.println(beta);
        charlie >>= beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie^= beta;
        System.out.println(charlie);
    }
    // Method for relational operator
    public void exampleRelational(){
        int echo = 25, foxtrot = 30, golf = 25;
        boolean isSample1 = echo == foxtrot;
        System.out.println(isSample1);
        boolean isample2 =echo != foxtrot;
        System.out.println(isample2);
        boolean isActual = foxtrot> golf;
        System.out.println(isActual);
        boolean isActual2 = foxtrot< golf;
        System.out.println(isActual2);
        boolean isFamiliar = echo >= golf;
        System.out.println(isFamiliar);
        boolean isFamiliar2 = foxtrot <= echo;
        System.out.println(isFamiliar2);

    }
 //method for increment
    public void exampleIncreament(){
        int home =10, jump, car;

        jump = home++;
        System.out.println(jump); //answer is 10


        car = ++home;
        System.out.println(car); // answer is 12

    }
// method for decrement
    public void  exampleDecrement(){

        int toy = 10, joe, jerry;
        joe = toy--;
        System.out.println(joe);
        jerry = --toy;
        System.out.print(jerry);

    }

}







