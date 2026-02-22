class Solution {
    
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        
        if(n < 3) return false;
        
        int i = 1;
        
        //  Strictly increasing
        while(i < n && nums[i] > nums[i - 1]) {
            i++;
        }
        
        // Must have at least one increasing move
        if(i == 1 || i == n) return false;
        
        // Strictly decreasing
        while(i < n && nums[i] < nums[i - 1]) {
            i++;
        }
        
        // Must have at least one decreasing move
        if(i == 1 || i == n) return false;
        
        //  Strictly increasing again
        while(i < n && nums[i] > nums[i - 1]) {
            i++;
        }
        
        // Must finish exactly at end
        return i == n;
    }
        
}