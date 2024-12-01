class Solution {
    public void moveZeroes(int[] nums) {
        int numsLength = nums.length;
        if (nums.length == 1)
            return;

        int prev = 0, next = 1;
        while (next < numsLength) {
            if (nums[prev] == 0 && nums[next] != 0) {
                int tempNum = nums[prev];
                nums[prev] = nums[next];
                nums[next] = tempNum;
                prev++;
            }
            else if (nums[prev] != 0) {
                prev++;
            }
            next++;
        }
    }
}