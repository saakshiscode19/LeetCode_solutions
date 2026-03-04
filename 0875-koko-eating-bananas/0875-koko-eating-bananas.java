class Solution {
    public boolean isAnswer(int[] nums, int ans, int hr){
        int req_hrs =0;
        for(int num : nums){
            req_hrs += Math.ceil((double)num/ans);
        }
        return req_hrs <=hr;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int r = Integer.MIN_VALUE;
        for(int pile : piles){
            r = Math.max(r, pile);;
        }
        int k = 0;
        while( l <=r){
            int mid = l +(r-l)/2;
            if(isAnswer(piles, mid, h)){
                k = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return k;
        
    }
}