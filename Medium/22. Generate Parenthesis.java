// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
// For example, given n = 3, a solution set is:
//
// [
//   "((()))",
//   "(()())",
//   "(())()",
//   "()(())",
//   "()()()"
// ]

public class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> result = new ArrayList<String>();
      backTrack(result,"",0,0,n);
      return result;
    }
    private void backTrack(List<String>result, String str, int left, int right, int max){
      if(str.length()==max*2){
        result.add(str);
        return;
      }
      if(left<max) backTrack(result, str+"(", left+1, right, max);
      if(right<left) backTrack(result, str+")", left, right+1, max);
    }
  }
