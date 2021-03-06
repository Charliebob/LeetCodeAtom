// You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.
//
// Write a function to determine if the starting player can guarantee a win.
//
// For example, given s = "++++", return true. The starting player can guarantee a win by flipping the middle "++" to become "+--+".

public class Solution {
    public boolean canWin(String s) {
      if(s==null || s.length()<2) return false;
      Map<String, Boolean> winMap = new HashMap<String, Boolean>();
      return canWin(s, winMap);
    }
    public boolean canWin(String s, Map<String, Boolean>winMap){
      if(winMap.containsKey(s)) return winMap.get(s);
      for(int i=0; i<s.length()-1; i++){
        if(s.charAt(i)=='+' && s.charAt(i+1) == '+'){
          String sOpponent = s.substring(0, i) + "--" + s.substring(i + 2);
                if(!canWin(sOpponent, winMap)) {
                    winMap.put(s, true);
                    return true;
                }
            }
        }
        winMap.put(s, false);
        return false;
    }
}
