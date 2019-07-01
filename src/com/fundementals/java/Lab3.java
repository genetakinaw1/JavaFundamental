package com.fundementals.java;

import java.util.Scanner;

public class Lab3 {
    public static void main(String args[]) {
    }
    public  void lab3Assignment(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter average of your marks (less than 100)::");
        int average = sc.nextInt();
        char grade;

        if(average>=80){
            grade = 'A';
        }else if(average>=60 && average<80){
            grade = 'B';
        }
        else if(average>=40 && average<60){
            grade = 'C';
        }
        else if(average>=20 && average<40) {
            grade = 'D';
        }
        else if (average>=1 && average<20){
            grade='F';
        }


        switch(average) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
                System.out.println("Very good");
            case 'C' :
                System.out.println("Good");
                break;
            case 'D' :
                System.out.println("Average");
            case 'F' :
                System.out.println("Fail");
                break;
            default :
                System.out.println("it is not a valid answer");
        }
        System.out.println("Your grade is " + average);
    }//end method for grade
    public void lab3Assignment2(){

        int abc = 0;
        do {

            if (abc % 3 == 0) {
                System.out.println(abc);

            }
            abc++;
        } while (abc < 50);

    }

    }


