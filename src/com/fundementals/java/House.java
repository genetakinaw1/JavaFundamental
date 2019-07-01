package com.fundementals.java;
/*
* This is our first class that we create ourselves
* */
public class House implements MyFirstInterface{

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
        this.setDoorColor(doorColor);
        this.setWindowSize(windowSize);
        this.setFooundation(getFooundation());
        this.roofType = roofType;

    }

    public void setRoofType(String roofType){
            this.roofType = roofType;
        }

    public String getRoofType() {
        return roofType;
    }

    //Our first method (function)//method over loading
    public void doorOpenClose(String message){
        System.out.println(message);
    }


    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }

    public String getFooundation() {
        return fooundation;
    }

    public void setFooundation(String fooundation) {
        this.fooundation = fooundation;
    }
    @Override
    public void endCall(){

    }



}
