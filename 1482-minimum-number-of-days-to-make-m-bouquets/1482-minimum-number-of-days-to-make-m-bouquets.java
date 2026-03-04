class Solution {
 public boolean isAns(int[] nums, int m, int k, int ans) {
        int count =0;
        for(int num : nums){
            if(num <= ans)
            count++;
            else count = 0;

            if(count ==k){
                m --;
                count = 0;
            }
        }
        return m <=0;
    }
       public int minDays(int[] bloomDay, int m, int k){
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for(int num : bloomDay){
            l = Math.min(l, num);
            r = Math.max(r, num);

        }
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isAns(bloomDay, m, k, mid)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
       }
}