class Solution {
    public int numSquares(int n) {
        if (isPerfectSquare(n))
            return 1;

        int temp = n;
        while ((temp & 3) == 0) 
            temp >>= 2;

        if ((temp & 7) == 7) 
            return 4;

        for (int i = 1; i * i <= n; i++) {
            if (isPerfectSquare(n - i * i)) 
                return 2;
        }

        return 3;
    }

    private boolean isPerfectSquare(int x) {
        int r = (int) Math.sqrt(x);
        return r * r == x;
    }
}