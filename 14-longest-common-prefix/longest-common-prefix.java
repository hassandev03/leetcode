class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstStr = strs[0];
        int strsLength = strs.length, longPrefixLength = firstStr.length();

        if (strsLength == 1)
            return firstStr;

        for (int i = 0; i < firstStr.length(); i++) {
            int j = 1;
            while (j < strsLength) {
                if (i == strs[j].length())
                    return firstStr.substring(0, i);

                if (firstStr.charAt(i) != strs[j].charAt(i))
                    return firstStr.substring(0, i);

                j++;
            }
        }
        return firstStr;
    }
}