class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
             long low = 1, high = 10000000000000000L;
             long result  =0;
             while(low <= high) {
                long mid = low + (high -low)/ 2;
                if(isPossible(mountainHeight, mid, workerTimes)) {
                    result = mid;
                    high = mid -1;
                }else{
                    low = mid+1;
                }

             }
             return result;
    }
    private boolean isPossible(int h, long mid, int[] worker){
        long totalHeightReduced =0 ;
        for(int n : worker){
            long c = -(2* mid) /n;
            double maxRoot = (-1 + Math.sqrt(1.0 - 4.0 *c)) /2.0;
            totalHeightReduced += (long) Math.floor(maxRoot);
            if(totalHeightReduced >= h) return true;
         }
         return totalHeightReduced >= h;
    }
}