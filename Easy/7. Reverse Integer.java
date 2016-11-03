// Reverse digits of an integer.
//
// Example1: x = 123, return 321
// Example2: x = -123, return -321

public class Solution {
    public int reverse(int x) {
      long digit = 0;
      while(x!=0){
        digit = digit*10 + x%10;
        if(digit>Integer.MAX_VALUE) return 0;
        if(digit<Integer.MIN_VALUE) return 0;
        x/=10;
      }
      return (int)digit;
    }
  }
