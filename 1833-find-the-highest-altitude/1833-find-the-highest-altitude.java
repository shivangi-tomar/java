class Solution {
    public int largestAltitude(int[] gain) {
        int CA=0;//currennt altitude
        int HA=0;//Highest altitude
        for (int i=0;i<gain.length;i++){
            CA += gain[i];
            HA = Math.max(HA, CA);
        }
        return HA;

        
        
    }
}