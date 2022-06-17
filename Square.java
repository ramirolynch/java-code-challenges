package com.ramirolynch;

public class Square {
    
    public static boolean isSquare(int n) {  
        int sr = (int)Math.pow(n,0.5);
          return (sr * sr) == n ? true : false;
      }

}
