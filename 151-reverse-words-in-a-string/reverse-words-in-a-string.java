class Solution {
    public String reverseWords(String s) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        int strLength = s.length();
        for (int i = 0; i < strLength;) {
            if (s.charAt(i) == ' ')
                i++;
            else {
                StringBuilder word = new StringBuilder();
                while (i < strLength && s.charAt(i) != ' ') {
                    word.append(s.charAt(i));
                    i++;
                }
                list.add(word);
            }
        }

        StringBuilder reversedWord = new StringBuilder();
        int listSize = list.size();
        for (int i = listSize - 1; i >= 0; i--) {
            reversedWord.append(list.get(i));
            if (i == 0)
                continue;
            reversedWord.append(' ');
        }
        return reversedWord.toString();
    }
}