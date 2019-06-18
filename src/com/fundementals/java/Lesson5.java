package com.fundementals.java;

/*
* The content of this class is for lesson 5slide deck.
* Primitive Data Types and more
* */
public class Lesson5 {

    // This primitive type can be true or false only.
    boolean myBoolean = true;

    // This primitive type has a value range of 0 to 65535
    char myChar = 'C';


    // This primitive has a value range of -128 to 127
    byte myByte = 9;


    // This primitive type has a value of -32768 to 32767
    short myShort = 235;

    /* This primitive type has a value
    -2147483648 to 2147483647*/
    int myInt = 2354;


    /*This primitive  type has a range of
    -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807*/
    long myLong = 568864L;

    //This primitive type has a range varies
    float myFloat = 34.53F;

    //This primitive value range varies
    double myDouble = 84.98;
    double myOtherDouble = 3643d;


    // Decimal value of 25;
    int value = 26;


    // Hexadecimal value of 25;
    int value2 = 0x1a;


    // Binary value of 26;
    int value3 = 0b11010;

    // scientific Notation uses E or e
    double d2 = 23.65E8;


    // Using under score to make the numbers readable
    long l2 = 4_568_987L;

    // This method shows a local variable

    public void showLocalExample() {
        int able = 20;
        System.out.println(able);

    }
    // Thi method has 2 parameteres separated by comma
    public void showLocalWithParameter (int able,int vals) {
        int total = able + vals;
        System.out.println (total);
    }

    public int showLocalWithReturn( int type1, int type2){
        return type1 + type2;
    }

    // Method shows Instance variables that changes value inside the method.
    public void showInstanceVariable(){
        System.out.println("Before");
        System.out.println(myDouble);
        System.out.println("After");
        myDouble= 98.6; //myDouble = 84.98 original value
        System.out.println(myDouble);
    }
    // Method shows implicit and explicit conversion
    public void showConversions(){
        long ll2 = myInt; //implicit or widening conversion
        int i5 = (int)myLong; //explicit or narrowing conversion
        int i10 = (int)l2; //explicit conversion over low

        //System.outprintln(i10); //274,020,071
        int i20 = (int)myDouble;//explicit or narrowing conversion;
        System.out.println(i20);// double value was 84.98

    }

}
