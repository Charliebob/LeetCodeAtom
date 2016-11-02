// Given an integer, write a function to determine if it is a power of three.
//
// Follow up:
// Could you do it without using any loop / recursion?
//
// Credits:
// Special thanks to @dietpepsi for adding this problem and creating all test cases.

public class Solution {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n)/ Math.log10(3)) % 1 == 0;
    }
}
