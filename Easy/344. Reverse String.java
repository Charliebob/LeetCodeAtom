// Write a function that takes a string as input and returns the string reversed.
//
// Example:
// Given s = "hello", return "olleh".

public class Solution {
    public String reverseString(String s) {
      char[] word = s.toCharArray();
      int start = 0;
      int end = s.length()-1;
      while(start<=end){
        char c = word[start];
        word[start] = word[end];
        word[end] = c;
        start++;
        end--;
      }
      return new String(word);
    }
  }
