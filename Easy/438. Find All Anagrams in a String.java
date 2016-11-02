// Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
//
// Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
//
// The order of output does not matter.
//
// Example 1:
//
// Input:
// s: "cbaebabacd" p: "abc"
//
// Output:
// [0, 6]
//
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".
// Example 2:
//
// Input:
// s: "abab" p: "ab"
//
// Output:
// [0, 1, 2]
//
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> result = new LinkedList<Integer>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return result;
        int[] ascii = new int[256];
        for (char c : p.toCharArray()) {
            ascii[c]++;
        }
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (ascii[s.charAt(right++)]-- >= 1) count--;
            if (count == 0) result.add(left);
            if (right - left == p.length() && ascii[s.charAt(left++)]++ >= 0) count++;
        }
        return result;
      }
    }
