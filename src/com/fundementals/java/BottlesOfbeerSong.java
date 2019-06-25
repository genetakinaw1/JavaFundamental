package com.fundementals.java;
/*
* This class demonstrates control flow using a song.
* */
public class BottlesOfbeerSong {

    private void lesson10private(){
        System.out.println("This is a privated method");
    }

    public void timeToSing(){
 int bottlesOfBeer =99;
 String word = "bottles", result = "";

 while (bottlesOfBeer > 0) {
     if (bottlesOfBeer ==1) {
         word = "bottle";
     }// end if
     System.out.println(bottlesOfBeer +" "+ word +" of Beer on the wall");
     System.out.println(bottlesOfBeer +" "+ word +"of the beer");
     System.out.println("Take one down");
     System.out.println("pass it around");
     bottlesOfBeer--;

     if (bottlesOfBeer>0){
         System.out.println(bottlesOfBeer +" "+ word +" of the beer on the wall");
     } else{
         System.out.println("No more bottles of beer on the wall");
     }//end of if/else


 }//end of while

    }//end of method
}//end class
