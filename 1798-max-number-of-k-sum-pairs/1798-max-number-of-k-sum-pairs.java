class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0;
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]<k){
                start++;
            }
            else if(nums[start]+nums[end]>k){
                end--;
            }
            else{
                start ++;
                end--;
                result++;
            }
            
        
        }
        return result ;
        
    }
}