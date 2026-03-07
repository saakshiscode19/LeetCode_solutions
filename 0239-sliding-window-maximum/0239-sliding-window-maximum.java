class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        //process first k element

        dq.addLast(0);
        for(int i =1; i<k; i++){
            while(!dq.isEmpty() && nums[i] >= nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        result.add(nums[dq.getFirst()]);
        //process remaining elements
        for(int i =k; i<n; i++){
            //remove elements out of window
            if(i -dq.getFirst() >= k){
                dq.removeFirst();
            }
            //remove smaller elements
            while(!dq.isEmpty() && nums[i] >= nums[dq.getLast()]){
                dq.removeLast();

            }
            dq.addLast(i);
            result.add(nums[dq.getFirst()]);
        }
        int[] resArr = new int[result.size()];
        for(int i= 0; i< result.size(); i++){
            resArr[i] = result.get(i);
        }
        return resArr;
    }
}