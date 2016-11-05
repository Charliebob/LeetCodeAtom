// Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to find the number of connected components in an undirected graph.
//
// Example 1:
//      0          3
//      |          |
//      1 --- 2    4
// Given n = 5 and edges = [[0, 1], [1, 2], [3, 4]], return 2.
//
// Example 2:
//      0           4
//      |           |
//      1 --- 2 --- 3
// Given n = 5 and edges = [[0, 1], [1, 2], [2, 3], [3, 4]], return 1.

public class Solution {
    public int countComponents(int n, int[][] edges) {
      int[] id = new int[n];
      for(int i=0; i<n; i++){
        id[i] = i;
      }
      for(int[] edge: edges){
        int i = root(id, edge[0]);
        int j = root(id, edge[1]);
        id[i] = j;
      }
      int count = 0;
      for(int i=0; i<n; i++){
        if(id[i]==i) count++;
      }
      return count;
    }
    public int root(int[] id, int i){
      while(i!=id[i]){
        id[i] = id[id[i]];
        i = id[i];
      }
    }
