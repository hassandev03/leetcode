class Solution {
    public void rotate(int[] nums, int k) {
        int numsLength = nums.length;
        k = k % numsLength; // if k > nums.length

        reverse(nums, 0, numsLength - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, numsLength - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tempNum = arr[start];
            arr[start] = arr[end];
            arr[end] = tempNum;

            start++;
            end--;
        }
    }
}