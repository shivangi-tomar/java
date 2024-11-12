/*class Solution {
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

}*/
class Solution {
    public int minChanges(String s) {
        int size= s.length();
        int result=0;
        if(size%2==0){
            for(int i=0;i<size-1;i=i+2)
            {
                if(s.charAt(i)!=s.charAt(i+1)){
                    result++;
                }
            }

        }else{
            return 0;
        }
        return result;
    }
}