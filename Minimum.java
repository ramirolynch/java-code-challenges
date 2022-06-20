package com.ramirolynch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java

// Task
// Given a list of digits, return the smallest number that could 
// be formed from these digits, using the digits only once (ignore 
// duplicates).


public class Minimum {
 

    public static int findMinimum(int[] values) {
        
        Set<Integer> set = new HashSet<>();
        
        for (Integer t : values) {
            // Add each integer into the set
            set.add(t);
        }
        
        List<Integer> arr = new ArrayList<>(set);
        
        Collections.sort(arr);
        
        
        StringBuilder sb = new StringBuilder();
        String result;
       
        for (int i = 0; i < arr.size(); i++) {
    
          int num = arr.get(i);
          sb.append(num);
   
   
        }
        
        result = sb.toString();   
      
      return Integer.valueOf(result);
    }
    
    public static void main(String[] args) {
        
        // returns 2
         
        int[] myArray = {5, 7, 9, 5, 7};
        
        System.out.println(findMinimum(myArray));
    
    }

}
