class Solution {
    public boolean isAns(int[] nums, int n, int ans){
        int curr = 0;
        int count =1;
        for(int num : nums){
            curr+= num;
            if(curr>ans){
                count++;
                curr = num;
            }
        }
        return count <= n;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(n<k) return -1;
        int l = Integer.MIN_VALUE;
        int r = 0;

        for(int num : nums){
            l = Math.max(l, num);
            r+= num;
        }
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isAns(nums, k, mid)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
        
    }
}