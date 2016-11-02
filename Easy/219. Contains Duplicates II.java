// Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashSet<Integer> hs = new HashSet<Integer>();
      for(int i=0; i<nums.length; i++){
        if(i>k) hs.remove(nums[i-k-1]);
        if(!hs.add(nums[i])) return true;
      }
      return false;
    }
  }
