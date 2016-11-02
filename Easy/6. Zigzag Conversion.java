// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"
// Write the code that will take a string and make this conversion given a number of rows:
//
// string convert(string text, int nRows);
// convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

public class Solution {
    public String convert(String s, int numRows) {

//		check basic case
		int len = s.length();
		if(len<=numRows || numRows<=1) return s;

//		save each result to a StringBuilder: 记住Stringbuilder数组初始化方法
		StringBuilder[] resultOfEachRow = new StringBuilder[numRows];
		for(int i=0; i<resultOfEachRow.length;i++){
			resultOfEachRow[i] = new StringBuilder();
		}
		int step = 2*(numRows - 1);
//		想到取余方法
		for(int i=0; i<len; i++){
			int group = i%step;
			if(group<numRows){
				resultOfEachRow[group].append(s.charAt(i));
			}else{
				resultOfEachRow[step-group].append(s.charAt(i));
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<numRows; i++){
			sb.append(resultOfEachRow[i].toString());
		}
		return sb.toString();
    }
}
