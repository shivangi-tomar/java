class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int low=0, high=costs.length-1;
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();

        long ans=0;
        while(k-->0){
            while(left.size()<candidates && low<=high){
                left.offer(costs[low++]);
            }
            while(right.size()<candidates && low<=high){
                right.offer(costs[high--]);
            }

            int c1 = left.size()>0 ? left.peek() : Integer.MAX_VALUE;
            int c2 = right.size()>0 ? right.peek() : Integer.MAX_VALUE;

            if(c1<=c2) ans += left.poll();
            else ans += right.poll();
        }

        return ans;
    }
}