class Solution {
    public void moveZeroes(int[] nums) {
        int numsLength = nums.length;
        if (nums.length == 1)
            return;

        int lastNonZeroIndex = 0;
        for (int index = 0; index < numsLength; index++) {
            if (nums[index] != 0)
                nums[lastNonZeroIndex++] = nums[index];
        }

        while (lastNonZeroIndex < numsLength)
            nums[lastNonZeroIndex++] = 0;

    }
}