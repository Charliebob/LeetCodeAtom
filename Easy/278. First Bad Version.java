// You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
//
// Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
//
// You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==0) return 0;
        return helper(n,1,n);
    }
    public int helper(int n, int start, int end){
        if(end<=start) return start;
        int mid = start + (end-start)/2;
        if(isBadVersion(mid)){
            return helper(n, start, mid);
        }else{
            return helper(n, mid+1, end);
        }
    }
}
