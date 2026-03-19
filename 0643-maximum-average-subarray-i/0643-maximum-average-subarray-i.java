class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int r = nums.length-1;
        double winsum =0;
        double maxsum = 0;
        for(int i=0; i<=k-1; i++){
            winsum += nums[i];
        }
        maxsum = winsum/k;
        for(int i=k; i<nums.length; i++){
            winsum += nums[i] - nums[i-k];
            maxsum = Math.max(maxsum, winsum/k);
        }
        return maxsum;
    }
}