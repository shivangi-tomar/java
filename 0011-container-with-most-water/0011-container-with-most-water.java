class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end =height.length-1;
        int max_volume =0;
        while(start<end){
            int h=Math.min(height[start],height[end]);
            int w=end-start;
            int curr_vol=h*w;
            max_volume=Math.max(max_volume,curr_vol);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
            


        }
        return max_volume ;

        
    }
}