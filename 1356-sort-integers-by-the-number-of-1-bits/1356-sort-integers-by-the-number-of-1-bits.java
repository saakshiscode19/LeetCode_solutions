class Solution {
    public int[] sortByBits(int[] arr) {
        int LARGE =  10001;

        for(int i =0; i<arr.length; i++){
            arr[i] = countOne(arr[i])* LARGE + arr[i];

        }
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] % LARGE;
        }
        return arr;
    }
    public int countOne(int n ){
        int c = 0;
        while(n>0){
            if((n&1) == 1) c++;
            n= n >>1;
        }
        return c;
    }
}