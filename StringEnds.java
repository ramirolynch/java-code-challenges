package com.ramirolynch;

// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

public class StringEnds {
    
    public static boolean checkEnd(String str, String ending) {
        
        
      // create two arrays of char, one for each string
            char[] strung = str.toCharArray(), out = ending.toCharArray();
            
      // if the length of the ending is greater than the length of the str, return false 
            if (out.length>strung.length) return false;
            
       // for loop that runs the length of the string ending
            for (int i=0; i<(out.length); i++)
        // here is the key, we start comparing the characters in the strings
        // from left to right rather than right to left
                
              if (strung[(strung.length-1)-i]!=out[(out.length-1)-i])
                  
                return false;
            return true;
            
          }
      
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
      }
        
    
    public static void main(String[] args) {
        
        solution("Ramiro", "miro");        
        
    }

}
