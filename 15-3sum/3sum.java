class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int numsLength = nums.length;
        Arrays.sort(nums);

        List<List<Integer>> zeroSum = new ArrayList<List<Integer>>();

        for (int i = 0; i < numsLength; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) // duplicate elements are consecutive due to sorting
                continue;

            int start = i + 1, end = numsLength - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    zeroSum.add(new ArrayList<Integer>(List.of(nums[i], nums[start], nums[end])));
                    start++;
                    end--;

                    // removing duplicates
                    while (start < end && nums[start] == nums[start - 1])
                        start++;

                    while (start < end && nums[end] == nums[end + 1])
                        end--;
                } else if (sum < 0)
                    start++;
                else
                    end--;
            }
        }
        return zeroSum;
    }
}