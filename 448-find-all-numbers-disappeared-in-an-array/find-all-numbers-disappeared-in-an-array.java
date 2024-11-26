class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            final int toNegNumIndex = Math.abs(nums[i]) - 1;
            if(nums[toNegNumIndex] > 0) 
                nums[toNegNumIndex] = -nums[toNegNumIndex];
        }

        final List<Integer> disappearedNums = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                disappearedNums.add(i + 1);
        }

        return disappearedNums;
    }
            



}