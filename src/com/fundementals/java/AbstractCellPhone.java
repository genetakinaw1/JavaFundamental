package com.fundementals.java;
/*
* This class demonstrates an abstract
* */
public abstract class AbstractCellPhone implements MyFirstInterface{
    /*
    * volume
    * screen
    * number keys
    * send key
    *
    * */
    private int volume;
    private String screen;
    private int[] numberKeys;
    private int sendKey;

    public AbstractCellPhone(int vol,int[] nkeys, int skey,String screen){
     this.volume = vol;
     this.numberKeys = nkeys;
     this.sendKey = skey;
     this.screen = screen;
    }//end constructor
public abstract void recieveCall();
    public abstract void sendCall();
    public abstract void endCall();

    public int getVolume() {
        return volume;
    }

    public String getScreen() {
        return screen;
    }

    public int[] getNumberKeys() {
        return numberKeys;
    }

    public int getSendKey() {
        return sendKey;
    }
}// end of class
