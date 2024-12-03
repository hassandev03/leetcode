
class Solution {
    public int romanToInt(String s) {
        int strLength = s.length();
        int value = 0;
        for (int i = 0; i < strLength; i++) {
            int digit1 = symbolValue(s.charAt(i));

            if (i + 1 < strLength) {
                int digit2 = symbolValue(s.charAt(i + 1));

                if (digit1 >= digit2)
                    value += digit1;
                else {
                    value = value + (digit2 - digit1);
                    i++;
                }
            } else {
                value += digit1;
            }
        }
        return value;
    }

    private int symbolValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}