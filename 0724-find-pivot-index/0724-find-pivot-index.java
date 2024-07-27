class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements in the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Subtract the current element from the total sum to get the right sum
            totalSum -= nums[i];

            // If the left sum equals the right sum, we found the pivot index
            if (leftSum == totalSum) {
                return i;
            }

            // Otherwise, update the left sum
            leftSum += nums[i];
        }

        // If no pivot index is found, return -1
        return -1;
    }
}