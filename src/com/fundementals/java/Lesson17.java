package com.fundementals.java;
import java.util.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


/*
the java.util.* should not be used in favor of individual imports do to memory limitations.
You don't need imports of classes that you will never use.
* This class goes over to lessson 17 content
* collection frame work
* */
public class Lesson17 {
    public void exampleArrayList(){
        List<String>list= new ArrayList<>();

        list.add("Happy");
        list.add("Tuesday");
        list.add("Not Monday");
        list.add("where\'s Friday");
        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));

        }
    }
    //end method

    public void exampleArrayList2(){
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(42);
        myList.add(103);
        myList.add(3);
        //for loop version
        for (int value = 0; value<myList.size(); value++){
            System.out.println(myList.get(value));
        }
        for (Integer integer : myList) {
            System.out.println(integer);
        }
        }//end method

        public void exampleHashSet(){
            HashSet<String> myHash = new HashSet<>();
            myHash.add("Firecrakers");
            myHash.add("Sparklers");
            myHash.add("Fountains");


            Iterator<String> iterate = myHash.iterator();
            while (iterate.hasNext()) {
                System.out.println(iterate.next());
            }


        }//end of method
    public void exampleHashMap(){
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(10,"Happy");
        myMap.put(20,"Days");
        myMap.put(30,"Are here");
        myMap.put(40,"Happy");

        for (Map.Entry<Integer,String> map: myMap.entrySet()) {
            System.out.println(map.getKey() +"=" +map.getValue());
        }


    }

    }//end of class












