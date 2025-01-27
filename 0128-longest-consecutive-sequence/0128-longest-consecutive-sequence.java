class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> numSet = new HashSet<>();
        int n = nums.length;

        // Add all numbers to the set
        for (int i = 0; i < n; i++) 
        {
            numSet.add(nums[i]);
        }

        int maxLen = 0;

        // Find the longest consecutive sequence
        for (int num : numSet) 
        {
            // Check if the current number is the start of a sequence
            if (!numSet.contains(num - 1)) 
            {
                int currNum = num;
                int currLen = 0;

                // Count the length of the consecutive sequence
                while (numSet.contains(currNum)) 
                {
                    currNum++;
                    currLen++;
                    maxLen = Math.max(maxLen, currLen);
                }
            }
        }

        return maxLen;
    }
}