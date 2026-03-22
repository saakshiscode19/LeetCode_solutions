class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i =0; i<4; i++){
            if(areEqual(mat, target)) return true;
            mat = rotateMatrix(mat);
        }
        return false;
    }
    private int[][] rotateMatrix(int[][] mat){
        int n = mat.length;
        int[][] res = new int[n][n];
        int col = n-1;
        int row = 0;
        while(col >= 0){
            for(int i =0; i<n; i++){
                res[i][col] = mat[row][i];
            }
            col--;
            row++;
        }
        return res;
    }
    private boolean areEqual(int[][]arr1, int[][] arr2){
        int n = arr1.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(arr1[i][j] != arr2[i][j])return false;
            }
        }
        return true;
    }
}