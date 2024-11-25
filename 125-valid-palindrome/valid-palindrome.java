class Solution {
    public boolean isPalindrome(String s) {
        char startChar, endChar;
        int startIndex = 0, endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            startChar = s.charAt(startIndex);
            endChar = s.charAt(endIndex);
            boolean isStartCharIntOrStr = (startChar >= 'A' && startChar <= 'Z') || (startChar >= 'a' && startChar <= 'z') || (startChar >= '0' && startChar <= '9');
            boolean isEndCharIntOrStr = (endChar >= 'A' && endChar <= 'Z') || (endChar >= 'a' && endChar <= 'z') || (endChar >= '0' && endChar <= '9');
            if (!isStartCharIntOrStr)
                startIndex++;
            
            else if (!isEndCharIntOrStr) 
                endIndex--;
            
            else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) 
                    return false;
            
                startIndex++;
                endIndex--;
            }
        }
        return true;
    }
}