
import java.util.*;  


class Solution {  
    public List<Integer> findDuplicates(int[] nums) {  
        List<Integer> myList = new ArrayList<>();  
        int n = nums.length;  
        for (int i = 0; i < n; i++) {  
            int m = Math.abs(nums[i]);  
            if (nums[m - 1] < 0) {  
                myList.add(m);  
            } else {  
                nums[m - 1] = -1 * nums[m - 1];  
            }  
        }  
        return myList;  
    }  
}
 
