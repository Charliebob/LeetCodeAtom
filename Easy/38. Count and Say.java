// The count-and-say sequence is the sequence of integers beginning as follows:
// 1, 11, 21, 1211, 111221, ...
//
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
// Given an integer n, generate the nth sequence.
//
// Note: The sequence of integers will be represented as a string.

public class Solution {
    public String countAndSay(int n) {
      if(n<=0) return null;
      String s = "1";
      int count = 1;
      for(int i=1; i<n; i++){
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<s.length(); j++){
          if(j<s.length()-1 && s.charAt(j)==s.charAt(j+1){
            count++;
          }else{
            sb.append(count);
            sb.append(s.charAt(j));
            count=1;
          }
        }
        s = sb.toString();
      }
      return s;
    }
  }
