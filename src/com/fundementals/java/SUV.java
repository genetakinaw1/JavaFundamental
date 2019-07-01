package com.fundementals.java;
public class SUV {
    private int passangerSeats;


    public SUV(int passangerSeats) {
        this.setPassangerSeats(passangerSeats);
        System.out.println("Default constructor");
    }
    public static void move(){
        System.out.println("move in and out");
    }

    public static void move(String blink){
        System.out.println(blink);
    }



    public int getPassangerSeats() {
        return passangerSeats;
    }

    public void setPassangerSeats(int passangerSeats) {
        this.passangerSeats = passangerSeats;
    }
}
