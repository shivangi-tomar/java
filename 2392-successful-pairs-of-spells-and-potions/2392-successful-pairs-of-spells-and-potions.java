import java.util.Arrays;

public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        
        // Sort the potions array for binary search
        Arrays.sort(potions);
        
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0, right = m - 1;
            
            // Binary search to find the first potion that forms a successful pair
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spell * potions[mid] >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            // The number of successful pairs for the current spell
            pairs[i] = m - left;
        }
        
        return pairs;
    }

}
