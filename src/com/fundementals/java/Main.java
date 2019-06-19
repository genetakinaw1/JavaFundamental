package com.fundementals.java;
/*
*This class is the starting class of this project
* This is an example of a multiple comment.
 */
public class Main {

    public static void main(String[] args) {
        moreLesson6();
        //lesson6Example();
        //lesson5Examples();
        //houseExample();

    }


    public static void moreLesson6() {

        Lesson6 myOtherLesson6 = new Lesson6();
        myOtherLesson6.exampleBuilder(" Spaghetti" , 2);
        myOtherLesson6.exampleChat();
        myOtherLesson6.exampleEscape();

    }
    public void Lesson6Example(){
        Lesson6 myLesson6 =new Lesson6();

    }

public static void lesson6Example(){
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleChartAt();
        myLesson6.examplConcat( " has awesome donuts");
        myLesson6.egxampleEquals("LaMars");
        String myLower = myLesson6.exampleLowerCase();
        System.out.println(myLower);
        String myUpper = myLesson6.exaampleUppercase();
        System.out.println(myUpper);
        myLesson6.exampleLength();


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
