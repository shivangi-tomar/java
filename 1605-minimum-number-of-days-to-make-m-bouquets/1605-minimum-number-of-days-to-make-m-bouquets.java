class Solution {
    public static boolean possible(int[] bloomDay, int day, int m, int k) {
        int n = bloomDay.length;
        int cnt = 0;
        int noofB = 0;

        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= day) {
                cnt++;
                if (cnt == k) {
                    noofB++;
                    cnt = 0; // reset after making 1 bouquet
                }
            } else {
                cnt = 0; // streak broken
            }
        }

        return noofB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long total = (long) m * k; // use long to avoid overflow
        int n = bloomDay.length;

        if (total > n) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(bloomDay, mid, m, k)) {
                ans = mid;         // possible answer found
                high = mid - 1;    // try to minimize
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
