package com.ramirolynch;


// Given a string of words, return the length of the shortest word(s).

// String will never be empty and you do not need to account for different data types.


public class ShortestWord {
    

        public static int findShort(String s) {
          
          String strArray[] = s.split(" ");
          
          int index = 0;
          
          int shortest = strArray[0].length();
          
          for(int i=0; i<strArray.length - 1; i++) {
              
              if(strArray[i+1].length() < shortest) {
                  
                  shortest = strArray[i+1].length();
                  
                  index = i + 1;
                  
              }
              
          }
          
          return strArray[index].length();
        }
        
        public static void main(String[] args) {
            
            
            // returns 2
            System.out.println(findShort("Let's travel abroad shall we"));
        
        }

}
