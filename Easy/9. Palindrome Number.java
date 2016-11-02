// Determine whether an integer is a palindrome. Do this without extra space.

public class Solution{
  public boolean isPalindrome(int x){
    int input = x;
    int reverse = 0;
    while(x>0){
      reverse = reverse*10 + x%10;
      x/=10;
    }
    return input==x;
  }
}
