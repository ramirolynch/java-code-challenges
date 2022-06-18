package com.ramirolynch;

public class SquareDigit {
    
        public static int squareDigits(int n) {
        
          String strDigits = String.valueOf(n);    
          String result = "";
          
          // "for-each" loop to loop through elements in array of characters 
          // strDigits.toCharArray()
          
          for (char c : strDigits.toCharArray()) {
                      
            // digit is a method of the object class character that returns the numeric value
            // of a character
              
            int digit = Character.digit(c, 10);
            
            // here we are adding the square of digit to the empty string declared in line 8
            // You can use increment operator += to add the result of digit * digit to 
            // the existing value of string named result
            
            result += digit * digit;
          }
          
          return Integer.parseInt(result);
        }

}
