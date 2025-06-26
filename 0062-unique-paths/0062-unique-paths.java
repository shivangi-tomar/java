class Solution {
    public int uniquePaths(int m, int n) {
        int N = m + n - 2;
        int r = Math.min(m - 1, n - 1); // Use the smaller of the two to optimize
        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - r + i) / i;
        }

        return (int) result;
    }
}


