package com.fundementals.java;

import java.util.IllegalFormatException;

/*
* The class content is for lesson 18.
* Exception Handling
* */
public class Lesson18 {
    String myStringNull;
    public void  exampleException(){
        try {
           System.out.println(myStringNull);
           System.out.println("Try Block ran");
        }catch (NullPointerException e){
            System.out.println("Null Exception thrown " + e.getMessage());

        }
    }//end of method
    public void  myArrayException(){
        String[] names = {"Dave","Matt","Jody"};
        String[] values = {"24333","42444444","38543"};
        try {
           byte b = Byte.parseByte(values[1]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least1 argument");
        }catch (NumberFormatException ed){
            System.out.println("That is not a number");
        } catch (StackOverflowError e){
            System.out.println("You have given me more than a byte");
        } catch (Exception ea ){
            System.out.println("I dunno what you did" +ea.toString());
        }finally {
            System.out.println("Finally my number didn't work.");
        }
    }
}//end class
