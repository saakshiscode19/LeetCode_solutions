class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long sum = 0;
        int mini = Integer.MAX_VALUE;
        boolean even = true;

        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                int val = matrix[i][j];
                sum+= Math.abs(val);
                if(val <0) even =! even;
                mini = Math.min(mini, Math.abs(val));
            }
        }
        if(even) return sum;

        return sum -2L * mini;
    }
}