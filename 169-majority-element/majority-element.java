class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, majorityElement = 0;

        for (int num: nums) {
            if (count == 0) {
                majorityElement = num;
                count = 1;
            }
            else if (majorityElement == num)
                count++;
            else
                count--;
        }

        return majorityElement;
    }
}