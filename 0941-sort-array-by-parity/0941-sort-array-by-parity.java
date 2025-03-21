class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {



            // Agar left index pe even number h to aage jana h
            if (nums[left] % 2 == 0) {
                left++;
            } 

            // Agar right index pe odd number h to peeche jana h
            else if (nums[right] % 2 != 0) {
                right--;
            } 

            // Agar left pe odd aur right pe even hai to swap karna

            else {
                
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}


