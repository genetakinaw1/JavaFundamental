package com.fundementals.java;

public class Truck {

    public static void main(String[] args) {
    }

    private String wheelsType;
    private int windowSize = 20;
    private String truckColor ;
    private int boxBed;


    public int getWindowSize() {
        return windowSize;
    }

    public String getWheelsType() {
        return wheelsType;
    }
public  String  getTruckColor(){
        return truckColor;
    }
    public int getBoxBed(){
        return boxBed;
    }
public Truck( String wheelsType,String truckColor){
        this(wheelsType,"yellow",30,6);
        this(wheelsType,"yellow",30,6);
        System.out.println("The truck color is"+truckColor);
}


    public Truck(String wheelsType,String truckColor,int windowSize,int boxBed){
        this.truckColor = truckColor;
        this.boxBed = boxBed;
        this.wheelsType = wheelsType;
        this.windowSize = windowSize;

    }

}
