class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
            
        }
        int longest=0;
        //set m pura array insert krr rahe h
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        } 
        //it mtlb starting consecutive ki aur -1 isliye ki usse pehle koyi hua toh vo startoing point  nhi hoga 
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
                while(set.contains(x+1)){
                    x=x+1;
                    cnt=cnt+1;
                }
                longest =Math.max(longest,cnt);
            }
        }
        return longest;
    }
}