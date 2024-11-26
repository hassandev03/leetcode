class Solution {
    public String reverseStr(String s, int k) {
        int index = 0, remainStrLen = 0;
        String revString = "";

        while (index < s.length()) {
            String remainString = s.substring(index);
            remainStrLen = remainString.length();

            if (remainStrLen < k) {
                revString += reverse(remainString);
            } else {
                int twoKStrStopIndex = (index + 2 * k) <= s.length() ? (index + 2 * k) : index + k;
                revString += (reverse(s.substring(index, index + k)) + s.substring(index + k, twoKStrStopIndex));
            }
            index = index + 2 * k;
        }

        return revString + s.substring(revString.length());
    }

    String reverse(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        return reverse(str.substring(1)) + str.substring(0, 1);
    }
}