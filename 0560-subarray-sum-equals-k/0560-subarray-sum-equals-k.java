import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        HashMap <Integer,Integer>Map=new HashMap<>();
        Map.put(0,1);
        int ans=0;
        int sum =0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(Map.containsKey(sum-k)){
                ans+=Map.get(sum-k);
            }
            if(Map.containsKey(sum)){
                Map.put(sum,Map.get(sum)+1);

            }
            else{
                Map.put(sum,1);
            }
        }
            return ans;


        
    }
}