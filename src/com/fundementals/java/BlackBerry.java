package com.fundementals.java;
/*
* this class serves as a child class to AbstractCellphone
* */

   public class BlackBerry extends AbstractCellPhone{

    public BlackBerry(int vol,int[] nkeys, int skey,String screen) {


        super(vol, nkeys, skey, screen);
    }
       @Override
       public void recieveCall() {
         System.out.println("Receiving phone call");
       }

       @Override
       public void sendCall() {
System.out.println("Sending Phone Call");
       }
       @Override
       public void endCall(){
        System.out.println("Call has ended");
       }
   }



