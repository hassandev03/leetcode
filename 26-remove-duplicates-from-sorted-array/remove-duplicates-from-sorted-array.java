class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[uniqueIndex] = nums[i + 1];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}