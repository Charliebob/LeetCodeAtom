// Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
//
// The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
//
//
// A partially filled sudoku which is valid.

public class Solution {
    public boolean isValidSudoku(char[][] board) {
      if(board.length!=9 || board[0].length!=9) return false;
      for(int row=0; row<9; row++){
        HashSet<Character> hs = new HashSet<Character>();
        for(int col=0; col<9; col++){
          if(board[row][col]!='.'){
            if(!hs.add(board[row][col]))
              return false;
          }
        }
      }
      for(int col=0; col<9; col++){
        HashSet<Character> hs = new HashSet<Character>();
        for(int row=0; row<9; row++){
          if(board[row][col]!='.'){
            if(!hs.add(board[row][col]))
              return false;
          }
        }
      }
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          HashSet<Character> hs = new HashSet<Character>();
          for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
              if(board[i*3+row][j*3+col]!='.'){
                if(!hs.add(board[i*3+row][j*3+col])){
                  return false;
                }
              }
            }
          }
        }
      }
      return true;
    }
  }
