class Solution {
    public static int FindDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = FindDays(weights, mid);
            if (numberOfDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
