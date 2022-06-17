package com.ramirolynch;

public class MiddleCharacter {
    
    public static String getMiddle(String word) {
        
        Boolean even = word.length() % 2 == 0;
        
        StringBuilder sb = new StringBuilder();
        
        if(even) {
        
        sb.append(word.charAt(word.length()/2 - 1));
        sb.append(word.charAt(word.length()/2));
          
        String singleString = sb.toString();
          
        return singleString;
        
        }
        
        else {
            
           int half = word.length() / 2;
           
           sb.append(word.charAt((int) Math.floor(half)));
          
          String singleString = sb.toString();
          
          return singleString;       
        }
  }
}
