class Solution {
    public int minChanges(String s) {
        char currentchar=s.charAt(0);
        int CCount =0;
        int minChangesRequired=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==currentchar){
                CCount ++;
                continue;
            }
            if (CCount % 2 == 0) {
                CCount = 1;
            }
             else {
                CCount = 0;
                minChangesRequired++;
            }
            currentchar=s.charAt(i);

        }
        return minChangesRequired;

        
    }

}