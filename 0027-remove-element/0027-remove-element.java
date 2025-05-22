class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] ans=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val) {
                ans[k]=nums[i];
                k++;
                }
        }
        for(int i=0;i<ans.length;i++){
            nums[i]=ans[i];
        }
        return k;
    }
}