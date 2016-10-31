// Given a string, determine if a permutation of the string could form a palindrome.
//
// For example,
// "code" -> False, "aab" -> True, "carerac" -> True.

public class Solution{
  public boolean canPermutePalindrome(String s){
    Set<Character> hs = new HashSet<Character>();
    for(int i=0; i<s.length(); i++){
      if(hs.contains(s.charAt(i))){
        hs.remove(s.charAt(i));
      }else{
        hs.add(s.charAt(i));
      }
    }
    return hs.size()==0 || hs.size()==1;
  }
}
