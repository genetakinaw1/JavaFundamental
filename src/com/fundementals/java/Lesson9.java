package com.fundementals.java;
/*
* The contents of the class is for lesson 9
* Arrays
* */


import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Lesson9 {

    public void  basicIntArray(){
        int[] intArray = {23, 45,12,8,95, 103, 37};
        for(int i = 0; i <intArray.length; i++){//the "i" value in Array method show how many position it can move
            System.out.println(intArray[i]);
        }//end for loop

    }//end of method

    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "happy";
        stringArray[1] = "tuesday";
        stringArray[2] = "movie";
        stringArray[3] = "grape";
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

    } //end of method

    public void basicTwoDimensionalArray(){
        int[][] myArray = {{23,45},{35,46},{57,98}};
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[j].length;j++) {
                System.out.println(myArray[i][j]);
            }
        }

    }//end of method
    //int
    public void basicThreeDimensionalArray(){
        int[][][] threeArray = new int[2][2][2];
        threeArray[0][0][0] = 10;
        threeArray[0][1][0] = 12;
        threeArray[0][0][1] = 13;
        threeArray[0][1][1] = 14;

        threeArray[1][0][0] = 15;
        threeArray[1][1][0] =16;
        threeArray[1][1][1] = 17;
        threeArray[1][0][1]=18;

        for (int i = 0; i < threeArray.length; i++){
          for (int j= 0; j< threeArray[i].length; j++){
              for(int k = 0; k < threeArray[j].length; k++){
                  System.out.println(threeArray[i][j][k]);
              }//end inner inner for loop
          }//end inner for loop
        }//end outer for loop
    }//end method
public void basicJaggedArray(){
        String[][] stringArray=new String [1][3];
        stringArray[0][0] = "June";
        stringArray[0][1] = "July";
        stringArray[0][2] = "August";
        for(int i = 0; i < stringArray.length; i++){
            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.println(stringArray[i][j]);
            }
        }
}



}//end class
