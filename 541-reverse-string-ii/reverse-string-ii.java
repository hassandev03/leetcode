class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder revString = new StringBuilder();
        StringBuilder str = new StringBuilder(s);
        int strLen = str.length();

        for (int index = 0; index < strLen; index += 2 * k) {
            String remainString = str.substring(index);
            int remainStrLen = remainString.length();

            if (remainStrLen < k) {
                revString.append(reverse(remainString));
            } else {
                int twoKStrStopIndex = (index + 2 * k) <= strLen ? (index + 2 * k) : index + k;
                revString.append(reverse(str.substring(index, index + k))).append(str.substring(index + k, twoKStrStopIndex));
            }
        }

        return revString.append(str.substring(revString.length())).toString();
    }

    private static StringBuilder reverse(String str) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }

        return reversedStr;
    }
}