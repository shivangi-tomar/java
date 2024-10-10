class Solution {
    public int firstUniqChar(String s) {
        
        
        int result=Integer.MAX_VALUE ;
        
        for (char i='a';i<='z';i++){
            int index=s.indexOf(i);
            if(index!=-1 && index==s.lastIndexOf(i)){
                result = Math.min(result,index);
            }
    }
    return result==Integer.MAX_VALUE?-1:result ;
      

        
        



        
    }
}