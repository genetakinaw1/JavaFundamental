package com.fundementals.java;
/*
* This class is used for Lesson 16 content
* Enumerations
* */
public class Lesson16 {
    public enum IceCreamFlavor {VNILA, CHOCOLATE, STRAWBERRY, ROCKY_ROAD}

    public void ShowEnum() {
        DaysOfTheWeek d1 = DaysOfTheWeek.TUE;
        System.out.println(d1);
        System.out.println(IceCreamFlavor.ROCKY_ROAD);
        System.out.println(DaysOfTheWeek.THU);
    }//end method


    public void myFavoriteFlavor(IceCreamFlavor flavors) {
        String message = "My favorite is ";
        switch (flavors) {
            case VNILA:
                message += "Vanilla";
                break;
            case CHOCOLATE:
                message += "Chocolate";
                break;
            case ROCKY_ROAD:
                message += "Rocky";
                break;
            case STRAWBERRY:
                message += "Strawberry";
                break;
                default:
                    message += "All Flavors";
        }
System.out.println(message);
    }//end of method
}//end of class
