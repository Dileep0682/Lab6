package com.collection;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
 
public class SortHashMapByValue {
 
    public static void main(String[] args) {
               
    	HashMap<String, Integer> hMap = new HashMap<String, Integer>();
                
        hMap.put("Six", 6);
        hMap.put("Seven", 7);
        hMap.put("Four", 4);
        hMap.put("Three", 3);
        hMap.put("One", 1);
        hMap.put("Five", 5);
                
        List<Integer> list = new ArrayList<Integer>( hMap.values() );
                
        Collections.sort(list, new Comparator<Integer>(){
 
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }            
            
        });
               
        System.out.println("Sorted Values");
        for(Integer value : list)
            System.out.println(value);
    }
    
}