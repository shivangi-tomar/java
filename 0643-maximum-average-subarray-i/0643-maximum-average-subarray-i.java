class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        int st=0;
        int ed=k;
        while(ed<nums.length){
            sum-=nums[st];
            st++;
            sum+=nums[ed];
            ed++;
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
        
    }
}