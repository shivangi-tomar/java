class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0;
        int Max=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                zero++;
                while(zero>1){
                    if(nums[i]==0){
                        zero--;
                    }
                    i++;
                }
                

            }
            Max = Math.max(Max,j-i);
            
        }
        return Max;
    }
}