class Solution {
    public boolean isAnagram(String s, String t) {
        int[] occurances = new int[26];

        for (int i = 0; i < s.length(); i++)
            occurances[s.charAt(i) - 'a']++;

        for (int i = 0; i < t.length(); i++) 
            occurances[t.charAt(i) - 'a']--;
        
        for (int number: occurances) {
            if (number != 0) return false;
        }

        return true;
    }
}