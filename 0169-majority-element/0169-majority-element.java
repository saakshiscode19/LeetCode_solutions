class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 1;
        int majority = nums[0];

        for(int i = 1; i<n; i++){
            if(nums[i] == majority){
                count++;
            }else{
                count--;
                if(count ==0)
                {
                    majority = nums[i];
                    count =1;
                }
            }
        }
        count =0;
        for(int i =0; i<n; i++)
        {
            if(nums[i] == majority){
                count++;
            }
        }
        if(count > n/2)
        return majority;
        else
        return -1;
    }
}