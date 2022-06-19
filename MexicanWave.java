package com.ramirolynch;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    
    public static String[] wave(String str) {    
        
        // List is an interface ArrayList is a class
        // of java Collection framework.
        
        List<String> list = new ArrayList<String>();
        
        for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          
      // if ch is an empty string, then continue skips the rest of the iteration
      // but doesn't break out of the loop
     
          if (ch == ' ') continue;
          list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
        }
        
        // below new String [0] returns the list as a string. This is explained here:
        // https://docs.oracle.com/javase/8/docs/api/java/util/List.html#toArray-T:A-
        
        return list.toArray(new String[0]);
      }
        
}
