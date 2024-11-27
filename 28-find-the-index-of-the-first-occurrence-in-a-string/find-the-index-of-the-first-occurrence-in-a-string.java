class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length(), needleLength = needle.length();
        
        for (int i = 0; i < haystackLength; i++) {
            if ((i + needleLength) > haystackLength)
                return -1;

            String subString = haystack.substring(i, i + needleLength);
            if (subString.equals(needle))
                return i;
        }
        return -1;
    }
}