package com.fundementals;

public class TruckExample {
    private String wheels;
    private String windows;
    private String boxBed;
    private String color;


    public TruckExample(String wheels, String windows, String boxBed, String color) {
        this.wheels = wheels;
        this.windows = windows;
        this.boxBed = boxBed;
        this.color = color;
    }

    public TruckExample(String boxBed) {
        this.boxBed = boxBed;
    }

    public void driving(){
System.out.println("blink");
   }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getBoxBed() {
        return boxBed;
    }

    public void setBoxBed(String boxBed) {
        this.boxBed = boxBed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
