class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length(), needleLength = needle.length();

        for (int i = 0; i < haystackLength - needleLength + 1; i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                int j = 0;
                while (j < needleLength && needle.charAt(j) == haystack.charAt(i + j))
                    j++;

                if (j == needleLength)
                    return i;
            }
        }
        return -1;
    }
}