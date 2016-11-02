// Given a non-empty string s and an abbreviation abbr, return whether the string matches with the given abbreviation.
//
// A string such as "word" contains only the following valid abbreviations:
//
// ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
// Notice that only the above abbreviations are valid abbreviations of the string "word". Any other string is not a valid abbreviation of "word".
//
// Note:
// Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.
//
// Example 1:
// Given s = "internationalization", abbr = "i12iz4n":
//
// Return true.
// Example 2:
// Given s = "apple", abbr = "a2e":
//
// Return false.

public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int lengthOfWord = word.length();
        int count = 0;
        int index = 0;
        while(index<abbr.length()){
            int digit = 0;
            while(index<abbr.length() && Character.isDigit(abbr.charAt(index))){
                if(abbr.charAt(index)=='0' && digit==0) return false;
                else{
                    digit = digit*10 + Integer.parseInt(abbr.charAt(index)+"");
                    index++;
                }
            }
            count+=digit;
            if(index<abbr.length() && Character.isLetter(abbr.charAt(index))){
                if(count>=word.length()) return false;
                if(abbr.charAt(index)!=word.charAt(count)) return false;
                else{
                    count++;
                    index++;
                }
            }
        }
        return lengthOfWord==count;
    }
}
