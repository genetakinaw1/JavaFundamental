package com.fundementals.java;
/*
*This class is the starting class of this project
* This is an example of a multiple comment.
 */
public class Main {

    public static void main(String[] args) {
   Lab2.basicMath2();


        //Demo myDemo = new Demo();
   //myDemo.exampleEscape();
   //myDemo.concatenation();
        //Demo myDemo = new Demo();
  // myDemo.addNumbers











    //lesson7Examples();

       // moreDemo();




        //moreLesson6();
        //lesson6Example();
        //lesson5Examples();
        //houseExample();

    }

    public static void lesson7Examples (){
        lesson7 myLesson7 = new lesson7();
        //myLesson7.basicMath();
        //myLesson7.exampleMadulus();
       // myLesson7.addTwoNumbers();
       // myLesson7.exampleAssignment1();
        //myLesson7.exampleAssignment2();
        //myLesson7.exampleRelational();
        //myLesson7.exampleIncreament();
        myLesson7.exampleDecrement();


    }



    public static void moreDemo(){


            int x =3;
            int c =4;
            System.out.println("The sum of the numbers is "+(x+c));

            long k = 10000000;
            long l = -45000000;
            System.out.println("The value of i is" +k);
            System.out.println("The value of j is "+l);

            float s = 10.11F;
            float z = -45.44F;
            System.out.println("The value of s is "+s);
            System.out.println("The value of j is "+z);

        double m = 10.11111111;
        double n = -45.4444444;
        System.out.println("The value of i is "+m);
        System.out.println("The value of n is "+n);



            short i=5;
        short j= -6;
        System.out.println("The value of i is"+i);
        System.out.println("The value of j is"+j);






    }
public static void Demo1(){
        int i = 5;
    System.out.println("The value of i is" +i);
    i=i+1;
    System.out.println("The value of i is" +i);
}




    public static void moreLesson6(){

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
