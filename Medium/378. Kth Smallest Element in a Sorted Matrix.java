// Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
//
// Note that it is the kth smallest element in the sorted order, not the kth distinct element.
//
// Example:
//
// matrix = [
//    [ 1,  5,  9],
//    [10, 11, 13],
//    [12, 13, 15]
// ],
// k = 8,
//
// return 13.
// Note:
// You may assume k is always valid, 1 ≤ k ≤ n2.

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      int n = matrix.length;
      int left = matrix[0][0], right = matrix[n-1][n-1];
      while(left<right){
        int mid = left + (right-left)/2;
        int temp = 0;
        for(int i=0; i<n; i++){
          temp+=binary_search(matrix[i],n,mid);
        }
        if(temp<k) left= mid+1;
        else right = mid;
      }
      return left;
    }
    private int binary_search(int[] row, int right, int x){
      int left = 0;
      while(left<right){
        int mid = left+(right-left)/2;
        if(row[mid]<=x) left=mid+1;
        else right = mid;
      }
      return left;
    }
