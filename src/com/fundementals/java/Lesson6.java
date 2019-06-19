package com.fundementals.java;

/*
* The content of this class is for lesson 6 slide deck.
* String and more
* */

public class Lesson6 {
    String myString = "LaMars";
    //Method shows string method for ChartAt

    public void exampleChartAt(){
        char mychar = myString.charAt(2);
        System.out.println(mychar);
    }
// Method shows string method of concat
    public void examplConcat(String value){
        String happy = myString.concat(value);
        System.out.println(happy);
    }
    // Method shows method of equals
    public void egxampleEquals(String donut){
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);

    }
    // method shows string method of lowercase
    public String exampleLowerCase(){
        return myString.toLowerCase();
}
 // Method shows string method of uppercase
 public String exaampleUppercase(){
        return myString.toUpperCase();
 }
//method shows string method of length
 public void exampleLength(){

      int length = myString.length();
      System.out.println(length);
    }
    // method shows string method of builder
    public void exampleBuilder (String food, int value){
        StringBuilder build = new StringBuilder();
        build.append("my fevorite food is" );
        build.append(food).append(" and I ate ")
        .append(value).append(" plates of it.");
              String fav = build.toString();
              System.out.println(fav);

    }
// method shows the example of character
    public void exampleChat(){
        char cl = 't';
        char c2 = '\u00A7'; //go to unicode to find the symbol of character
        System.out.println(c2);

    }
// Method shows example for escape sequences
    public void exampleEscape(){
        /*
        * Inserts a tab in the text at this point
        * Inserts a newline in the text at this point
        * Inserts a single quote (apostrophe) in the text at this point




        * */
        System.out.println("That\'s a cool toy.\tcan I\n play with it.");
    }

}


