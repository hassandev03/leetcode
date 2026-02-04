class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                currOnes++;
            }
            if (currOnes > maxOnes) {
                maxOnes = currOnes;
            }

            if (num == 0) {
                currOnes = 0;
            }
        }

        return maxOnes;
    }
}