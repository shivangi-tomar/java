class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return new int[0][0];

        // पहले start के आधार पर sort करें
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        // एक ही pass में merge करते रहें
        for (int[] curr : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < curr[0]) {
                merged.add(curr);  // नया interval
            } else {
                // overlap है → end को extend करें
                merged.get(merged.size() - 1)[1] = 
                    Math.max(merged.get(merged.size() - 1)[1], curr[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
