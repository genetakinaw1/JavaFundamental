package com.fundementals.java;
import com.fundementals.TruckExample;
import com.fundementals.lesson10.Lesson10;

/*
*This class is the starting class of this project
* This is an example of a multiple comment.
 */
public class Main {

    public static int num = 0;

    static {
        System.out.println("Static block 1");
        num = 42;
    }

    static {
        System.out.println("Static block 2");
        num = 62;

    }//end of static block.

    public static void main(String[] args) {
        lesson17Example();

        //lesson16Example();
     //lesson15Example();
//lesson14Example();
        //lab3Assignment2();
        //lab3Assignment();
        // SUV();
        // lesson12Example();
        //TruckExample();

        //lesson11Example();
//lesson10Example();
        //lesson9Example();
        // beerSong();
        //lesson8Examples2();
        //lesson8Examples1();
        //Lab2.basicMath2();

        //Demo myDemo = new Demo();
        //myDemo.exampleEscape();
        //myDemo.concatenation();
        //Demo myDemo = new Demo();
        // myDemo.addNumbers
    }//end of main method


    public static void lesson17Example(){
        Lesson17 myLesson17 = new Lesson17();
        //myLesson17.exampleArrayList();
       // myLesson17.exampleArrayList2();
       // myLesson17.exampleHashSet();
        myLesson17.exampleHashMap();
    }

public static void lesson16Example(){
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.ShowEnum();
        myLesson16.myFavoriteFlavor(Lesson16.IceCreamFlavor.STRAWBERRY);
        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for(DaysOfTheWeek day: d1) {
            System.out.println(day + " at index " +day.ordinal());
        }
}

    public static void lesson15Example() {
        int[] mykeys = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        BlackBerry myBlackberry = new BlackBerry(25, mykeys, 0, "Color Screen");
myBlackberry.recieveCall();
        AbstractCellPhone myOldPhone = new BlackBerry(30, mykeys, 1, "Monochrome");
        myOldPhone.recieveCall();
        myOldPhone.endCall();





}//end of method
public static void lesson14Example() {
    //Lesson14.MY_FIRST_FINAL = 10;//can not change value of a final.
    int total = Lesson14.MY_FIRST_FINAL * 35;

    System.out.println(total);

// can change the value of a non-final static
    Lesson14.myFirstStatic = 98; //original is 35
    System.out.println(Lesson14.myFirstStatic);
    Lesson14.myFirstStaticMethod(10);
    System.out.println("Block number was " +num);
    Lesson14.MyInnerClass test = new Lesson14.MyInnerClass();
    test.myInnerMethod();

}


    public static void lab3Assignment2(){

        Lab3 myabc= new Lab3();
        myabc.lab3Assignment2();

    }



    public static void SUV(){
        SUV mySUV =new SUV(8);
        mySUV.getPassangerSeats();
        System.out.println((mySUV.getPassangerSeats()));
    }
    public static void lesson12Example(){
        Condo myCondo = new Condo();
        myCondo.doorOpenClose();
        Condo mySecondCondo = new Condo("railing","Orange",32,"composite","steel");
        System.out.println(mySecondCondo.getDoorColor());
    }

public static void TruckExample(){
        TruckExample myTruckExample = new TruckExample("Chrome","Tinted","Short","Hunter Green");
         myTruckExample.setColor("candy cane");
         myTruckExample.setBoxBed("long");
        System.out.println((myTruckExample.getWheels()));
        System.out.println(myTruckExample.getWindows());
        System.out.println(myTruckExample.getBoxBed());
        System.out.println(myTruckExample.getColor());


}
public static void lesson11Example() {
        House house1 = new House ();

        House house2 = new House ("Orange peel");
    }

    public static void lesson10Example(){
        //try to see a private method in another class
        //Lesson6 myLesson6 =new Lesson6();
       // myLesson6.examplePrivate(); //can not access

        BottlesOfbeerSong song =new BottlesOfbeerSong();
        // song.lesson10Private(); //can not acess
        Lesson10 myLesson = new Lesson10();
       // myLesson.showlesson
       //myLesson.showProtected(); //can not access

    }


    public static void lesson9Example(){
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicStringArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();

    }

    public static void beerSong(){
        BottlesOfbeerSong song = new BottlesOfbeerSong();
        song.timeToSing();


    }
    public static void lesson8Examples2(){
        Lesson8 otherLesson = new Lesson8();
       otherLesson.basicWhileExample();
       otherLesson.basicDoWhileExample();
       otherLesson.basicForLoopExample();
       otherLesson.basicBranchingExample();


    }
        public static void lesson8Examples1(){
            Lesson8 myLesson8 = new Lesson8();
            myLesson8.basicIfExample(5,10);//prints before and after
            myLesson8.basicIfExample(5,5);//print before,if and after
            myLesson8.basicIfExample(10,12);//not equal
            myLesson8.basicIfExample(12,12);//equal
            myLesson8.basicIfElseChainExample(42);
            myLesson8.basicIfAndOrExample(36);
            myLesson8.basicSwitchExample(3);

        }









    //lesson7Examples();

       // moreDemo();




        //moreLesson6();
        //lesson6Example();
        //lesson5Examples();
        //houseExample();















    public static void lesson7Examples (){
        //lesson7 myLesson7 = new lesson7();
        //myLesson7.basicMath();
        //myLesson7.exampleMadulus();
       // myLesson7.addTwoNumbers();
       // myLesson7.exampleAssignment1();
        //myLesson7.exampleAssignment2();
        //myLesson7.exampleRelational();
        //myLesson7.exampleIncreament();
       // myLesson7.exampleDecrement();


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

    }

}
