package com.ramirolynch;

import java.util.Arrays;

// codewars

// https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

public class AnagramDetector {
    

      public static boolean isAnagram(String test, String original) {
          
        if( test == null || original == null || test.length() != original.length())
          return false;
          
        char ch1 [] = test.toLowerCase().toCharArray(); 
        char ch2 [] = original.toLowerCase().toCharArray(); 
        
        
        // because an anagram is basically the same word organized differently
        // if we sort the arrays, the arrays should
        // equal. We have to remember that the order is important in arrays. If arrays have the same
        // values but different order, they are not equal.
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1, ch2);
        
      }
  

    public static void main (String[]args) {
        
  
        System.out.println(isAnagram("Amiror", "Ramiro")); // returns true
        
    }
    
  }