// Given numRows, generate the first numRows of Pascal's triangle.
//
// For example, given numRows = 5,
// Return
//
// [
//      [1],
//     [1,1],
//    [1,2,1],
//   [1,3,3,1],
//  [1,4,6,4,1]
// ]

public class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if(numRows<=0) return result;
      for(int i=0; i<numRows; i++){
        List<Integer> level = new ArrayList<Integer>();
        for(int j=0; j<=i; j++){
          if(j=0 || j==i){
            level.add(1);
          }else{
            level.add(level.get(i-1).get(j-1)+level.get(i-1).get(j))
          }
        }
        result.add(level);
      }
      return result;
    }
  }
