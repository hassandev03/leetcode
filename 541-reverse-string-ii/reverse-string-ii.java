class Solution {
    public String reverseStr(String s, int k) {
        String revString = "";
        int strLen = s.length();

        for (int index = 0; index < strLen; index += 2 * k) {
            String remainString = s.substring(index);
            int remainStrLen = remainString.length();

            if (remainStrLen < k) {
                revString += reverse(remainString);
            } else {
                int twoKStrStopIndex = (index + 2 * k) <= strLen ? (index + 2 * k) : index + k;
                revString += (reverse(s.substring(index, index + k)) + s.substring(index + k, twoKStrStopIndex));
            }
        }

        return revString + s.substring(revString.length());
    }

    private static String reverse(String str) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }

        return reversedStr.toString();
    }
}