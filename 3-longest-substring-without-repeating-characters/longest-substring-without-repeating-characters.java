class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[128];

        for (int i = 0; i < 128; i++)
            hash[i] = -1;

        int prev = 0, maxLength = 0;
        for (int next = 0; next < s.length(); next++ ) {
            int ch = s.charAt(next);
            if (hash[ch] != -1) {
                if (hash[ch] >= prev) 
                    prev = hash[ch] + 1;
            }

            int length = next - prev + 1;
            maxLength = length > maxLength ? length : maxLength;
            hash[ch] = next;
        }

        return maxLength;
    }
}