package com.fundementals.java;
/*
* This is our first class that we create ourselves
* */
public class House {

   private String roofType;
    private int windowSize;
    private String fooundation;
    private String doorColor;

    public House(){
        System.out.println("This is the default constructor");
    }
    public House(String doorColor) {
       this(doorColor,24,"concrete","shigle");
        System.out.println("The door color is " + doorColor);
    }

    public House(String doorColor, int windowSize,String foundation,String roofType) {
        this.doorColor = doorColor;
        this.windowSize = windowSize;
        this.fooundation = fooundation;
        this.roofType = roofType;

    }

    public void setRoofType(String roofType){
            this.roofType = roofType;
        }

    public String getRoofType() {
        return roofType;
    }

    //Our first method (function)
    public void doorOpenClose(){
        System.out.println("Open my door");
    }
}
