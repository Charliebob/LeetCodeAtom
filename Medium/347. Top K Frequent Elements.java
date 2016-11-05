// Given a non-empty array of integers, return the k most frequent elements.
//
// For example,
// Given [1,1,1,2,2,3] and k = 2, return [1,2].
//
// Note:
// You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
// Your algorithm's time complexity must be better than O(n log n), where n is the array's size.

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
      List<Integer> result = new LinkedList<Integer>();
      if(k<1) return result;
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      for(int i=0; i<nums.length; i++){
        if(hm.containsKey(nums[i])){
          hm.put(nums[i],hm.get(nums[i])+1);
        }else{
          hm.put(nums[i], 1);
        }
      }
      PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
      for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
        pq.offer(entry);
        if(pq.size()>k) pq.poll();
      }
      while(!pq.isEmpty()){
        result.add(0, pq.poll().getKey());
      }
      return result;
    }
  }
