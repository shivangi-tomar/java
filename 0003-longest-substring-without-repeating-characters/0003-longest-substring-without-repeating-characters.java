class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowStart=0;
        int windowEnd=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int maxLength=Integer.MIN_VALUE;
        while(windowEnd<n){
            char ch=s.charAt(windowEnd);
            if(map.containsKey(ch)&&map.get(ch)>=windowStart){
                windowStart=map.get(ch)+1;

            }
            map.put(ch,windowEnd);
            maxLength=Math.max(maxLength,windowEnd-windowStart+1);
            windowEnd++;
        }
        return(maxLength==Integer.MIN_VALUE)?0:maxLength;
    }
}