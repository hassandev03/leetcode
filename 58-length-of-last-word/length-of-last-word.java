class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0, spaceIndex = s.length() - 1;

        while (s.charAt(spaceIndex) == ' ')
            spaceIndex--;

        while (spaceIndex >= 0 && s.charAt(spaceIndex) != ' ') {
            lengthOfLastWord++;
            spaceIndex--;
        }

        return lengthOfLastWord;
    }
}