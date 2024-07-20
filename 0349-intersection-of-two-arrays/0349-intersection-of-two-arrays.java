import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> Set =new HashSet<>();
        HashSet<Integer> resultSet=new HashSet<>();
        for(int num:nums1){
            Set.add(num);
        }
        for(int num:nums2){
            if(Set.contains(num)){
                resultSet.add(num);
                }
        }
        int []answer=new int[resultSet.size()];
        int index=0;
        for(int num:resultSet){
            answer[index++]=num;

        }


        return answer;
        

       

        
    }
}